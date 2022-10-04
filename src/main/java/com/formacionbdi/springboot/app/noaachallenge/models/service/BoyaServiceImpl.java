package com.formacionbdi.springboot.app.noaachallenge.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.formacionbdi.springboot.app.noaachallenge.models.ColorLuz;
import com.formacionbdi.springboot.app.noaachallenge.models.dao.BoyaDao;
import com.formacionbdi.springboot.app.noaachallenge.models.entity.Boya;

@Service
public class BoyaServiceImpl implements IBoyaService {	

	@Autowired
	private BoyaDao boyaDao;

	@Override
	public void save(Boya boya) {	
		boyaDao.save(boya);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Boya> findAll() {
		return (List<Boya>) boyaDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Boya findById(Integer id) {
		return boyaDao.findById(id).orElse(null);
	}

	@Override
	public void setColor(Integer id, Boya boya) {
		Boya bAux = findById(id);
		if(bAux!=null) {
			bAux.setColorLuz(boya.getColorLuz());
			boyaDao.save(bAux);
		}
		
	}

	@Override
	public void delete(Integer id) {
		boyaDao.deleteById(id);
		
	}
		
}
