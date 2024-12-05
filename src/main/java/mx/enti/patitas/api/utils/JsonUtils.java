package mx.enti.patitas.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import mx.enti.patitas.api.model.Usuario;


@Component
public class JsonUtils {
    private static final Logger LOG = LoggerFactory.getLogger(JsonUtils.class);
    
    public String jsonUser(Usuario user){
        Gson gson = new Gson();
        LOG.info(gson.toJson(user));
        return gson.toJson(user);
    }
    
    public Usuario objectUser(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Usuario.class);
    }
}