package com.formacionbdi.springboot.app.noaachallenge.models.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.formacionbdi.springboot.app.noaachallenge.models.entity.Muestra;
import com.formacionbdi.springboot.app.noaachallenge.models.requests.MuestraRequest;

public interface IMuestraService {
	
	public Muestra save(MuestraRequest muestra);
	public Muestra findById(Integer id);
	public List<Muestra> getMuestrasPorId(Integer id);
	public void restearColor(Integer id);
	public List<Muestra> getMuestrasPorColor(@PathVariable String color);
	public List<Muestra> getIdBoyaMinAlturaNivelMar(Integer idBoya);
}
