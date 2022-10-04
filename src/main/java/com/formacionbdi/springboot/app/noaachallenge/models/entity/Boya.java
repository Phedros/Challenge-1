package com.formacionbdi.springboot.app.noaachallenge.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "boya")
public class Boya implements Serializable{
		
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name = "color_luz")
	//@Enumerated(EnumType.STRING)
	private String colorLuz;
	
	private Double latitud;	
	
	@OneToMany(mappedBy = "boya")
	private List<Muestra> muestraList;	
	
	private Double longitud;	

	public Boya(Integer id, String colorLuz, Double latitud, Double longitud) {
		super();
		this.id = id;
		this.colorLuz = colorLuz;
		this.latitud = latitud;
		this.longitud = longitud;
	}


	public Boya() {
		
	}
	
	
	/* public List<Muestra> getMuestraList() { return muestraList; } */
	 
	
	public void setMuestraList(List<Muestra> muestraList) {
		this.muestraList = muestraList;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getColorLuz() {
		return colorLuz;
	}

	public void setColorLuz(String colorLuz) {
		this.colorLuz = colorLuz;
	}
	
	public Double getLatitud() {
		return latitud;
	}
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	
	private static final long serialVersionUID = -7585205011760487788L;

}
