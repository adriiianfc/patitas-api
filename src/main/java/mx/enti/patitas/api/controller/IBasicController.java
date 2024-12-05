package mx.enti.patitas.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins= {"http://localhost:4200"}, methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT,RequestMethod.OPTIONS})
public interface IBasicController<T> {
	@GetMapping("/findById")
	public T findById(@RequestParam int id);
	
	@GetMapping("/getAll")
	public List<T> getAll();
	
	@PostMapping("/exist")
	public List<T> exist(@RequestBody T ent);
	
	@PostMapping("/save")
	public List<T> save(@RequestBody T ent);
	
	@PostMapping("/filter")
	public List<T> filter(@RequestBody T ent);
	
	@PostMapping("/delete")
	public T delete(@RequestBody T ent);
}

