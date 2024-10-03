package com.mx.apiPantallas.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
CREATE TABLE PANTALLAS_STORE(
ID_PANTALLA NUMBER PRIMARY KEY,
MARCA VARCHAR2 (60) NOT NULL,
PRECIO NUMBER NOT NULL,
CANTIDAD NUMBER NOT NULL,
FECHA_LLEGADA DATE
 );
 */

@Entity
@Table(name = "PANTALLAS_STORE")
public class Pantallas {

	@Id
	
	@Column(name = "ID_PANTALLA", columnDefinition = "NUMBER", nullable = false)
	private Long idPantalla;
	
	@Column(name = "MARCA", columnDefinition = "VARCHAR2 (60)", nullable = false)
	private String marca;
	
	@Column(name = "PRECIO", columnDefinition = "NUMBER", nullable = false)
	private Long precio;
	
	@Column(name = "CANTIDAD", columnDefinition = "NUMBER", nullable = false)
	private Integer cantidad;
	
	@Column(name = "FECHA_LLEGADA", columnDefinition = "DATE", nullable = false)
	private Date fechaLlegda;

	// CONSTRUCTOR VACIO
	public Pantallas() {
	}

	// CONSTRUCTOS CON PARAMETROS
	public Pantallas(Long idPantalla, String marca, Long precio, Integer cantidad, Date fechaLlegda) {
		this.idPantalla = idPantalla;
		this.marca = marca;
		this.precio = precio;
		this.cantidad = cantidad;
		this.fechaLlegda = fechaLlegda;
	}


	// METODO TOSTRING
	@Override
	public String toString() {
		return "Pantallas [idPantalla=" + idPantalla + ", marca=" + marca + ", precio=" + precio + ", cantidad="
				+ cantidad + ", fechaLlegda=" + fechaLlegda + "]\n";
	}
	
	
	// ENCAPSULAMIENTO
	public Long getIdPantalla() {
		return idPantalla;
	}

	public void setIdPantalla(Long idPantalla) {
		this.idPantalla = idPantalla;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaLlegda() {
		return fechaLlegda;
	}

	public void setFechaLlegda(Date fechaLlegda) {
		this.fechaLlegda = fechaLlegda;
	}
	
	
}
