package mx.enti.patitas.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.enti.patitas.api.model.Usuario;
import mx.enti.patitas.api.repositories.UsuarioRepository;


@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository repo;
    
    public Usuario login(String username){
        return repo.login(username);
    }
}
