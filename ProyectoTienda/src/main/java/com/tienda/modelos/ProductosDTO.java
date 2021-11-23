package com.tienda.modelos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Productos")
public class ProductosDTO {
	@Id
	private String _id;
	private long CodigoProducto;
	private String NombreProducto;
	private long NitProveedor;
	private double PrecioCompra;
	private double IvaCompra;
	private double PrecioVenta;
	
	
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public long getCodigoProducto() {
		return CodigoProducto;
	}
	public void setCodigoProducto(long codigoProducto) {
		CodigoProducto = codigoProducto;
	}
	public String getNombreProducto() {
		return NombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}
	public long getNitProveedor() {
		return NitProveedor;
	}
	public void setNitProveedor(long nitProveedor) {
		NitProveedor = nitProveedor;
	}
	public double getPrecioCompra() {
		return PrecioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		PrecioCompra = precioCompra;
	}
	public double getIvaCompra() {
		return IvaCompra;
	}
	public void setIvaCompra(double ivaCompra) {
		IvaCompra = ivaCompra;
	}
	public double getPrecioVenta() {
		return PrecioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		PrecioVenta = precioVenta;
	}
	

}
