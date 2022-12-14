package com.idat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "detalle_hospedaje")
public class HospedajeDetalle {
	
	@Id
	private TuristaHospedajeFK fk = new TuristaHospedajeFK();

	public TuristaHospedajeFK getFk() {
		return fk;
	}

	public void setFk(TuristaHospedajeFK fk) {
		this.fk = fk;
	}
	 
	
}
