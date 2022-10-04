package com.formacionbdi.springboot.app.noaachallenge.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "muestra")
public class Muestra {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	
	@ManyToOne()
	@JoinColumn(name = "id_boya", referencedColumnName = "id")
	private Boya boya;	
	private Date horario;	
	@Column(name = "matriculaEmbarcacion")
	private String matriculaEmbarcacion;	
	@Column(name = "longitud_actual")
	private Double longitudActualBoya;	
	@Column(name = "latitud_actual")
	private Double latitudActualBoya;
	
	@Column(name = "altura_nivel_mar")
	private Double alturaNivelMar;	
	
	public Muestra(Double alturaNivelMar, Boya boyaAux, Date horario, Double longitudActualBoya,
			Double latitudActualBoya, String matriculaEmbarcacion) {
		this.boya = boyaAux;
		this.horario = horario;
		this.matriculaEmbarcacion = matriculaEmbarcacion;
		this.longitudActualBoya = longitudActualBoya;
		this.latitudActualBoya = latitudActualBoya;
		this.alturaNivelMar = alturaNivelMar;
	}


	public Muestra() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boya getBoya() {
		return boya;
	}

	public void setBoya(Boya boya) {
		this.boya = boya;
	}

	public Date getHorario() {
		return horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	public String getMatriculaEmbarcacion() {
		return matriculaEmbarcacion;
	}

	public void setMatriculaEmbarcacion(String matriculaEmbarcacion) {
		this.matriculaEmbarcacion = matriculaEmbarcacion;
	}

	public Double getLongitudActualBoya() {
		return longitudActualBoya;
	}

	public void setLongitudActualBoya(Double longitudActualBoya) {
		this.longitudActualBoya = longitudActualBoya;
	}

	public Double getLatitudActualBoya() {
		return latitudActualBoya;
	}

	public void setLatitudActualBoya(Double latitudActualBoya) {
		this.latitudActualBoya = latitudActualBoya;
	}

	public Double getAlturaNivelMar() {
		return alturaNivelMar;
	}

	public void setAlturaNivelMar(Double alturaNivelMar) {
		this.alturaNivelMar = alturaNivelMar;
	}
	
	
	
	
	

}
