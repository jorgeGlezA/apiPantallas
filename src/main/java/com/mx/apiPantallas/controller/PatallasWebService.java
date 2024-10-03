package com.mx.apiPantallas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.apiPantallas.model.Pantallas;
import com.mx.apiPantallas.service.PantallasImp;

@RestController
@RequestMapping(path = "PantallassWebService")
@CrossOrigin
public class PatallasWebService {

	@Autowired
	PantallasImp imp;

	// http://localhost:9000/PantallassWebService/listar
	@GetMapping(path = "listar")
	public List<Pantallas> listar() {
		return imp.listar();
	}

	// http://localhost:9000/PantallassWebService/guardar
	@PostMapping(path = "guardar")
	public void guardar(@RequestBody Pantallas pantalla) {
		imp.guardar(pantalla);
	}

	// http://localhost:9000/PantallassWebService/buscar
	@PostMapping(path = "buscar")
	public Pantallas buscar(@RequestBody Pantallas pantalla) {
		return imp.buscar(pantalla.getIdPantalla());
	}
	
	// http://localhost:9000/PantallassWebService/editar
	@PostMapping(path = "editar")
	public void editar(@RequestBody Pantallas pantalla) {
		imp.editar(pantalla);
	}
	
	// http://localhost:9000/PantallassWebService/eliminar
	@PostMapping(path = "eliminar")
	public void eliminar(@RequestBody Pantallas pantalla) {
		imp.eliminar(pantalla.getIdPantalla());
	}
	
}
