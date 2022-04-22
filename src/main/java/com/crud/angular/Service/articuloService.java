package com.crud.angular.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.angular.Model.Articulo;
import com.crud.angular.Repository.iarticuloRepository;

@Service
public class articuloService implements iarticuloService {
	@Autowired
	private iarticuloRepository repo;
	
	@Override
	public boolean agregarArticulo (Articulo articulo) {
		repo.save(articulo);
		return true;
	}
	
	public void elimiarArticulo (Integer id) {
		repo.deleteById(id);
	}
	
	
}
