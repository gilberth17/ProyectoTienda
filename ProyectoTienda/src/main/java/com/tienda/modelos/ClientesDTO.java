package com.tienda.modelos;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Clientes")
public class ClientesDTO {
	
	private long CedulaCliente;
	private String NombreCliente;
	private long TelCliente;
	private String EmailCliente;
	private String DirrecionCliente;
	private String Sede;
	public long getCedulaCliente() {
		return CedulaCliente;
	}
	public void setCedulaCliente(long cedulaCliente) {
		CedulaCliente = cedulaCliente;
	}
	public String getNombreCliente() {
		return NombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		NombreCliente = nombreCliente;
	}
	public long getTelCliente() {
		return TelCliente;
	}
	public void setTelCliente(long telCliente) {
		TelCliente = telCliente;
	}
	public String getEmailCliente() {
		return EmailCliente;
	}
	public void setEmailCliente(String emailCliente) {
		EmailCliente = emailCliente;
	}
	public String getDirrecionCliente() {
		return DirrecionCliente;
	}
	public void setDirrecionCliente(String dirrecionCliente) {
		DirrecionCliente = dirrecionCliente;
	}
	public String getSede() {
		return Sede;
	}
	public void setSede(String sede) {
		Sede = sede;
	}
	
}
