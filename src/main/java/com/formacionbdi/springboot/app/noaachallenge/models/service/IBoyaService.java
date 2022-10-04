package com.formacionbdi.springboot.app.noaachallenge.models.service;
//import com.formacionbdi.springboot.app.noaachallenge.models.ColorLuz;

import java.util.List;

import com.formacionbdi.springboot.app.noaachallenge.models.entity.Boya;

public interface IBoyaService {
	
	public void save(Boya boya);
	public List<Boya> findAll();
	public Boya findById(Integer id);
	public void setColor(Integer id, Boya boya);
	public void delete(Integer id);

}
