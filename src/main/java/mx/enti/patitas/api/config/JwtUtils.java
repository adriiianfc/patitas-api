package mx.enti.patitas.api.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import mx.enti.patitas.api.model.Usuario;
import mx.enti.patitas.api.utils.JsonUtils;

import java.time.Instant;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class JwtUtils {

    private static final Logger LOG = LoggerFactory.getLogger(JwtUtils.class);

    private static final String KEY = "mySecretKey";
    
    @Autowired
    private JsonUtils jsonUtils;

    public String generateJwtToken(Authentication authentication, Usuario user) {
        Instant now = Instant.now();
        return Jwts
                .builder()
                .setId(authentication.getName())
                .setSubject(jsonUtils.jsonUser(user))
                .claim("authorities",
                        authentication.getAuthorities())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 600000))
                .signWith(SignatureAlgorithm.HS512,
                        KEY.getBytes()).compact();
    }

    public String getUserNameFromJwtToken(String token) {
        Claims body = Jwts.parser().setSigningKey(KEY.getBytes()).parseClaimsJws(token).getBody();
        LOG.info(body.getSubject());
        return body.getId();
    }
    
    public Usuario getUserData(String token){
        return jsonUtils.objectUser(Jwts.parser().setSigningKey(KEY.getBytes()).parseClaimsJws(token).getBody().getSubject());
    }

    public boolean validateJwtToken(String token) {
        Claims body = Jwts.parser().setSigningKey(KEY.getBytes()).parseClaimsJws(token).getBody();
        LOG.info(body.getSubject());
        return true;
    }
}
