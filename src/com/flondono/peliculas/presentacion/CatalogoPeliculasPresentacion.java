package com.flondono.peliculas.presentacion;

import com.flondono.peliculas.servicio.CatalogoPeliculasImpl;
import com.flondono.peliculas.servicio.ICatalogoPeliculas;

import java.util.Scanner;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {

        int opcion = -1;
        Scanner scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();


        while (opcion != 0) {
            System.out.println("Elige una opcion: \n" +
                    "1. Iniciar catalogo de peliculas\n" +
                    "2. Agregar pelicula\n" +
                    "3. Listar peliculas\n" +
                    "4. Buscar pelicula\n" +
                    "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPelicula();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula");
                    String nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce una pelicula a buscar");
                    String buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Hasta Pronto!");
                    break;
                default:
                    System.out.println("Opción no reconocida");
                    break;
            }
        }
    }
}
