package com.tienda.modelos;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Ventas")
public class VentasDTO {
	private long CedulaCliente;
	private long CodigoVenta;
	private String DetalleVenta;
	private double IvaVenta;
	private double TotalVenta;
	private double ValorVenta;
	
	
	
	
	public long getCedulaCliente() {
		return CedulaCliente;
	}
	public void setCedulaCliente(long cedulaCliente) {
		CedulaCliente = cedulaCliente;
	}
	public long getCodigoVenta() {
		return CodigoVenta;
	}
	public void setCodigoVenta(long codigoVenta) {
		CodigoVenta = codigoVenta;
	}
	public String getDetalleVenta() {
		return DetalleVenta;
	}
	public void setDetalleVenta(String detalleVenta) {
		DetalleVenta = detalleVenta;
	}
	public double getIvaVenta() {
		return IvaVenta;
	}
	public void setIvaVenta(double ivaVenta) {
		IvaVenta = ivaVenta;
	}
	public double getTotalVenta() {
		return TotalVenta;
	}
	public void setTotalVenta(double totalVenta) {
		TotalVenta = totalVenta;
	}
	public double getValorVenta() {
		return ValorVenta;
	}
	public void setValorVenta(double valorVenta) {
		ValorVenta = valorVenta;
	}
	
	
	

}
