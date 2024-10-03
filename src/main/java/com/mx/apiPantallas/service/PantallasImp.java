package com.mx.apiPantallas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.apiPantallas.dao.PantalasDao;
import com.mx.apiPantallas.model.Pantallas;

@Service
public class PantallasImp implements PantallaServ {

	@Autowired
	PantalasDao dao;
	
	@Transactional(readOnly = true)
	@Override
	public List<Pantallas> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Transactional
	@Override
	public void guardar(Pantallas pantalla) {
		// TODO Auto-generated method stub
		dao.save(pantalla);
	}

	@Transactional(readOnly = true)
	@Override
	public Pantallas buscar(Long idPantalla) {
		// TODO Auto-generated method stub
		return dao.findById(idPantalla).orElse(null);
	}

	@Transactional
	@Override
	public void editar(Pantallas pantalla) {
		// TODO Auto-generated method stub
		dao.save(pantalla);
	}

	@Transactional
	@Override
	public void eliminar(Long idPantalla) {
		// TODO Auto-generated method stub
		dao.deleteById(idPantalla);
	}

}
