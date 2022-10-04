package com.formacionbdi.springboot.app.noaachallenge.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.formacionbdi.springboot.app.noaachallenge.models.entity.Boya;

public interface BoyaRepository extends JpaRepository<Boya, Integer>{	
	
	@Query("update Boya  b set color_luz = ?1  where b.id = ?2")
	  Boya updateColorLuz(String color,Integer id);	  

}
