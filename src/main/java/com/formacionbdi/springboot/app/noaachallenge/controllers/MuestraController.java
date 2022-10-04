package com.formacionbdi.springboot.app.noaachallenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.app.noaachallenge.models.entity.Boya;
import com.formacionbdi.springboot.app.noaachallenge.models.entity.Muestra;
import com.formacionbdi.springboot.app.noaachallenge.models.requests.MuestraRequest;
import com.formacionbdi.springboot.app.noaachallenge.models.service.IMuestraService;

@RestController
@RequestMapping("/muestra")
public class MuestraController {

	@Autowired
	private IMuestraService muestraService;

	@Autowired
	private IMuestraService boyaService;

	@PostMapping("/guardar")
	public Muestra guardar(@RequestBody MuestraRequest muestra) {
		return muestraService.save(muestra);

	}

	@GetMapping("boya/{id}")
	public List<Muestra> ver(@PathVariable Integer id) {
		return boyaService.getMuestrasPorId(id);
	}

	@DeleteMapping("/{id}")
	public void resetearColor(@PathVariable Integer id) {
		muestraService.restearColor(id);
	}
	
	@GetMapping("/colores/{color}")
	public List<Muestra> getMuestrasPorColor(@PathVariable String color){
		return muestraService.getMuestrasPorColor(color);
	}
	
	@GetMapping ("/minima/{idBoya}")
	public List<Muestra> getMuestraMinima(@PathVariable Integer idBoya){
		return muestraService.getIdBoyaMinAlturaNivelMar(idBoya);
	}
}
