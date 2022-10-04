package com.formacionbdi.springboot.app.noaachallenge.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonSerialize(using = ColorLuzSerializer.class)
public enum ColorLuz{
	
	rojo, ROJO, VERDE, AZUL, AMARILLO;

}
