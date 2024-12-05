package mx.enti.patitas.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.enti.patitas.api.model.Cita;
import mx.enti.patitas.api.service.CitasService;

@RestController
@RequestMapping("/citas")
public class CitaController {
    @Autowired
    private CitasService ser;
    
    @GetMapping("/getAll")
    public List<Cita> getAll(){
        return ser.getAll();
    }
}

