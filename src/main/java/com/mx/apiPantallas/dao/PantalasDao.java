package com.mx.apiPantallas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.apiPantallas.model.Pantallas;

@Repository
public interface PantalasDao extends JpaRepository<Pantallas, Long> {

}
