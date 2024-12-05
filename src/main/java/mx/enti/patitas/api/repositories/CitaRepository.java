package mx.enti.patitas.api.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.enti.patitas.api.model.Cita;
import mx.enti.patitas.api.model.Usuario;


@Repository
public interface CitaRepository extends CrudRepository<Cita, Integer>{
    //@Query("SELECT u FROM Usuario u WHERE u.usuario = ?1 ")
    //public Usuario login(String username);
}
