package mx.enti.patitas.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.enti.patitas.api.model.Cliente;
import mx.enti.patitas.api.repositories.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository<Cliente> repo;
	
	public Cliente findById(int id) {
		return repo.findById(id).get();
	}
	
	public List<Cliente> getAll() {
		return repo.getAll();
	}

	public List<Cliente> save(Cliente ent) {
		if (ent.getId() == 0) {
			if (exist(ent).isEmpty()) {
				repo.save(ent);
				return exist(ent);
			} else {
				return exist(ent);
			}
		} else {
			return exist(repo.save(ent));
		}
	}

	public <S extends Cliente> List<Cliente> exist(S ent) {
		return repo.exist(ent.getNombre());
	}

	public boolean delete(Cliente ent) {
		repo.delete(ent);
		return true;
	}

	public List<Cliente> filter(Cliente ent) {
		return repo.filter(ent.getNombre());
	}
}
