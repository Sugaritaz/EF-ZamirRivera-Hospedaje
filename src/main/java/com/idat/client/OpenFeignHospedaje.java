package com.idat.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.dto.HospedajeDTO;



@FeignClient(name = "Hospedaje-microservicio", url= "localhost:8888")
public interface OpenFeignHospedaje {
	@GetMapping("//api//alumno/v1/listar")
	public List<HospedajeDTO>listarAlumnos();
	
}
