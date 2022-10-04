package com.formacionbdi.springboot.app.noaachallenge.models.requests;

import java.util.Date;

public class MuestraRequest {

	private Double alturaNivelMar;
	private Integer boya_id;
	private Date horario;
	private String matriculaEmbarcacion;
	private Double longitudActualBoya;
	private Double latitudActualBoya;
	
	public MuestraRequest() {
		
	}
	public MuestraRequest(Double alturaNivelMar, Integer boya_id, Date horario, String matriculaEmbarcacion,
			Double longitudActualBoya, Double latitudActualBoya) {
		
		this.alturaNivelMar = alturaNivelMar;
		this.boya_id = boya_id;
		this.horario = horario;
		this.matriculaEmbarcacion = matriculaEmbarcacion;
		this.longitudActualBoya = longitudActualBoya;
		this.latitudActualBoya = latitudActualBoya;
	}
	public Double getAlturaNivelMar() {
		return alturaNivelMar;
	}
	public void setAlturaNivelMar(Double alturaNivelMar) {
		this.alturaNivelMar = alturaNivelMar;
	}
	public Integer getBoya_id() {
		return boya_id;
	}
	public void setBoya_id(Integer boya_id) {
		this.boya_id = boya_id;
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
	
	
	

}
