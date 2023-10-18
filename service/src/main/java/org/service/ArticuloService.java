package org.service;

import org.domain.Articulo;
import org.repository.ArticuloRepository;
import org.repository.ArticuloRepositoryImpl;

public class ArticuloService {

	private ArticuloRepository repository;
	
	public ArticuloService() {
		this.repository = new ArticuloRepositoryImpl();
	}
	
	//metodos de servicio
	public void crearArticulo(Articulo articulo) {
		this.repository.create(articulo);
	}
}
