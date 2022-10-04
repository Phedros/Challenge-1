package com.formacionbdi.springboot.app.noaachallenge.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.app.noaachallenge.models.dao.MuestraDao;
import com.formacionbdi.springboot.app.noaachallenge.models.entity.Boya;
import com.formacionbdi.springboot.app.noaachallenge.models.entity.Muestra;
import com.formacionbdi.springboot.app.noaachallenge.models.requests.MuestraRequest;

@Service
public class MuestraService implements IMuestraService {

	@Autowired
	public MuestraDao muestraDao;

	@Autowired
	public IBoyaService boyaService;

	@Override
	public Muestra save(MuestraRequest muestraReq) {
		Muestra muestra = new Muestra();
		Boya boyaAux = boyaService.findById(muestraReq.getBoya_id());

		if (boyaAux != null) {

			if (muestraReq.getAlturaNivelMar() < -100.0 || muestraReq.getAlturaNivelMar() > 100.0) {
				boyaAux.setColorLuz("AMARILLO");
			}
			if (muestraReq.getAlturaNivelMar() < -50.0 || muestraReq.getAlturaNivelMar() > 50.0) {
				boyaAux.setColorLuz("AZUL");
			} else
				boyaAux.setColorLuz("ROJO");

			muestra = new Muestra(muestraReq.getAlturaNivelMar(), boyaAux, muestraReq.getHorario(),
					muestraReq.getLongitudActualBoya(), muestraReq.getLatitudActualBoya(),
					muestraReq.getMatriculaEmbarcacion());
			muestraDao.save(muestra);
		}
		return muestra;
	}

	@Override
	@Transactional(readOnly = true)
	public Muestra findById(Integer id) {
		return muestraDao.findById(id).orElse(null);
		
	}

	@Override
	public void restearColor(Integer id) {
		Muestra muestraAux = findById(id);
		if(muestraAux != null) {
			muestraAux.getBoya().setColorLuz("AZUL");
			muestraDao.save(muestraAux);
		}
	}

	@Override
	public List<Muestra> getMuestrasPorId(Integer id) {
		return muestraDao.getMuestrasPorId(id);
	}

	@Override
	public List<Muestra> getMuestrasPorColor(String color) {
		List<Muestra> muestras = muestraDao.findAll();		
		return muestras.stream()
                       .filter(m -> m.getBoya().getColorLuz().equalsIgnoreCase(color))
                       .collect(Collectors.toList());
		
		
	}

	@Override
	public List<Muestra> getIdBoyaMinAlturaNivelMar(Integer idBoya) {
		return muestraDao.getIdBoyaMinAlturaNivelMar(idBoya);
		
	}

}
