package mx.enti.patitas.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.enti.patitas.api.model.Cliente;

@Repository
public interface ClienteRepository <T extends Cliente> extends CrudRepository<Cliente, Integer> {
	@Query("SELECT ent FROM Cliente ent")
    public <S extends T> List<S> getAll();
    
    @Query("SELECT ent FROM Cliente ent where nombre = ?1")
    public <S extends T> List<S> exist(String nombre);
	
    @Query("SELECT ent FROM Cliente ent where "
    		+ "(nombre like %?1%)")
    public <S extends T> List<S> filter(String nombre);
}
