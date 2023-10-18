package org.repository;

import org.domain.Articulo;

public class ArticuloRepositoryImpl implements ArticuloRepository{
	//atributos para poder conectarme a la db
	public void create(Articulo articulo) {
		String sql = "insert int articulo (id) values("+articulo.getId()+")";
		System.out.println(sql);
	}
}
