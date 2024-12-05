package mx.enti.patitas.api.config;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.enti.patitas.api.model.Usuario;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtResponse {
 
    private String token;
    private String username;
    private List<String> roles;
    private Usuario user;
}