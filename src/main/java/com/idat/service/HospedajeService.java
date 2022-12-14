package com.idat.service;

import java.util.List;

import com.idat.dto.HospedajeDTO;

public interface HospedajeService {
	List<HospedajeDTO>listar();
	void guardar(HospedajeDTO hospedaje);
}
