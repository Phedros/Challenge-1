package com.formacionbdi.springboot.app.noaachallenge.service;

import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;

import com.formacionbdi.springboot.app.noaachallenge.models.dao.MuestraDao;
import com.formacionbdi.springboot.app.noaachallenge.models.entity.Boya;
import com.formacionbdi.springboot.app.noaachallenge.models.entity.Muestra;
import com.formacionbdi.springboot.app.noaachallenge.models.requests.MuestraRequest;
import com.formacionbdi.springboot.app.noaachallenge.models.service.IBoyaService;
import com.formacionbdi.springboot.app.noaachallenge.models.service.MuestraService;

@SpringBootTest
public class MuestraServiceTest {
	
	@Autowired
    MuestraService bService;

    @MockBean
    IBoyaService boyaService;

    @MockBean
    MuestraDao muestraRepoAux;
    
    @Test
    public void saveRojo(){
        MuestraRequest muestraRequest = new MuestraRequest();
        muestraRequest.setAlturaNivelMar(-101.0);
        muestraRequest.setHorario(new Date());
        muestraRequest.setBoya_id(111);
        muestraRequest.setLatitudActualBoya(105.25);
        muestraRequest.setLongitudActualBoya(205.12);
        muestraRequest.setMatriculaEmbarcacion("666");

        Boya boyita = new Boya();
        boyita.setColorLuz("AZUL");
        when(boyaService.findById(111)).thenReturn(boyita);

        Muestra muestrita = new Muestra();
        muestrita.setBoya(boyita);
        when(muestraRepoAux.save(any())).thenReturn(muestrita);

        Muestra resultado = bService.save(muestraRequest);
        assertEquals("AZUL", resultado.getBoya().getColorLuz());


    }

}
