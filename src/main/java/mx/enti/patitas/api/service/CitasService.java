package mx.enti.patitas.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.enti.patitas.api.model.Cita;
import mx.enti.patitas.api.repositories.CitaRepository;

@Service
public class CitasService {
	@Autowired
	CitaRepository repo;
	
	public List<Cita> getAll(){
		List<Cita> citas = new ArrayList<>();
		for(Cita cita : repo.findAll()){
            citas.add(cita);
        }
        return citas;
	}
}
