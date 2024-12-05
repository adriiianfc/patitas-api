package mx.enti.patitas.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.enti.patitas.api.model.Cliente;
import mx.enti.patitas.api.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController implements IBasicController<Cliente>{
	@Autowired
	ClienteService ser;
	
	@Override
	public List<Cliente> getAll() {
		return ser.getAll();
	}

	@Override
	public Cliente findById(int id) {
		return ser.findById(id);
	}

	@Override
	public List<Cliente> exist(Cliente ent) {
		return ser.exist(ent);
	}

	@Override
	public List<Cliente> save(Cliente ent) {
		return ser.save(ent);
	}

	@Override
	public Cliente delete(Cliente ent) {
		ent.setId((ser.delete(ent))?0:ent.getId());
		return ent;
	}

	@Override
	public List<Cliente> filter(Cliente ent) {
		return ser.filter(ent);
	}

}
