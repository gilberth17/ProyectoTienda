package com.tienda.modelos;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Consolidado")
public class ConsolidadoDTO {
	private String _id;
	private String Ciudad;
	private double TotalVentas;
	
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public double getTotalVentas() {
		return TotalVentas;
	}
	public void setTotalVentas(double totalVentas) {
		TotalVentas = totalVentas;
	}
	
	

}
