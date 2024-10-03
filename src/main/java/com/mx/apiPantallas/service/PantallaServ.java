package com.mx.apiPantallas.service;

import java.util.List;

import com.mx.apiPantallas.model.Pantallas;

public interface PantallaServ {

	public List<Pantallas> listar();

	public void guardar(Pantallas pantalla);

	public Pantallas buscar(Long idPantalla);

	public void editar(Pantallas pantalla);

	public void eliminar(Long idPantalla);
}
