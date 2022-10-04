package com.formacionbdi.springboot.app.noaachallenge.models;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class ColorLuzSerializer extends StdSerializer{

	protected ColorLuzSerializer(Class t) {
		super(t);
		// TODO Auto-generated constructor stub
	}
	
	public ColorLuzSerializer() {
        super(ColorLuz.class);
    }

	public void serialize(ColorLuz colorLuz, JsonGenerator generator, SerializerProvider provider) throws IOException {
		generator.writeStartObject();
        generator.writeFieldName("colorLuz");
        generator.writeString(colorLuz.toString());
        generator.writeEndObject();
		
	}

	
	public void serialize(Object value, JsonGenerator generator, SerializerProvider provider) throws IOException {
		
		
	}
	

}
