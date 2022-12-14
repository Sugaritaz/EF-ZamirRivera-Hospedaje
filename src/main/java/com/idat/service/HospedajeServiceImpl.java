package com.idat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.dto.HospedajeDTO;
import com.idat.model.Hospedaje;
import com.idat.repository.HospedajeRepository;


public class HospedajeServiceImpl implements HospedajeService {

	@Autowired
	private HospedajeRepository repository;
	
	@Override
	public List<HospedajeDTO> listar() {
		List<HospedajeDTO> listadto = new ArrayList<>();
        HospedajeDTO dto = null;
        
        for(Hospedaje hospedaje : repository.findAll()) {
        dto = new HospedajeDTO();
        dto.setCod(hospedaje.getIdHospedaje());
        dto.setNom(hospedaje.getNombre());
        listadto.add(dto);
        }
        return listadto;
        
	}

	@Override
	public void guardar(HospedajeDTO hospedaje) {
		// TODO Auto-generated method stub
		Hospedaje hos = new Hospedaje();
		hos.setCod(hospedaje.getIdHospedaje());
		hos.setNom(hospedaje.getNombre());
		repository.save(hos);
		
	}

}
