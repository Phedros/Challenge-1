package com.formacionbdi.springboot.app.noaachallenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.formacionbdi.springboot.app.noaachallenge.models.ColorLuz;
import com.formacionbdi.springboot.app.noaachallenge.models.entity.Boya;
import com.formacionbdi.springboot.app.noaachallenge.models.service.IBoyaService;

@RestController
@RequestMapping("/boya")
public class BoyaController {
	
	@Autowired
	private IBoyaService boyaService;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Boya boya) {
		boyaService.save(boya);
	}
	
	@GetMapping("/listar")
	public List<Boya> listar(){		
		return boyaService.findAll();		
	}
	
	@GetMapping("/ver/{id}")
	public Boya detalle(@PathVariable Integer id) {
		return boyaService.findById(id);		
	}
	
	@PutMapping("/cambiar/{id}")
	public void cambiar (@PathVariable Integer id, @RequestBody Boya boya) {
		boyaService.setColor(id, boya);
		
	}
	
	@DeleteMapping("/borrar/{id}")
	public void borrar(@PathVariable Integer id) {
		boyaService.delete(id);
	}
		
}
