package org.console;

import java.util.Scanner;

import org.domain.Articulo;
import org.service.ArticuloService;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese Id de articulo");
		Long id = teclado.nextLong();

		Articulo articulo = new Articulo(id);

		// crear un servicio ArticuloService
		ArticuloService service = new ArticuloService();
		service.crearArticulo(articulo);
		
		teclado.close();
		System.out.println("fin");

	}
}
