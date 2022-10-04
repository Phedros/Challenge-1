package com.formacionbdi.springboot.app.noaachallenge.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.formacionbdi.springboot.app.noaachallenge.models.entity.Muestra;

public interface MuestraDao extends JpaRepository<Muestra, Integer>{
	
	@Query(value ="SELECT * FROM MUESTRA m WHERE m.id_boya = ?1", nativeQuery = true)
	 public List<Muestra> getMuestrasPorId(Integer id_boya);
	
	@Query(value = "SELECT * FROM noaachallenge.muestra where altura_nivel_mar = (select MIN(altura_nivel_mar) from noaachallenge.muestra WHERE id_boya = ?1) AND id_boya = ?1"
			, nativeQuery = true)
	 public List<Muestra> getIdBoyaMinAlturaNivelMar(Integer idBoya);
}      
