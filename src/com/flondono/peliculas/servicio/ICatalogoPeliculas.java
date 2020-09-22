package com.flondono.peliculas.servicio;

public interface ICatalogoPeliculas {

    String NOMBRE_RECURSO = "peliculas.txt";

    void agregarPelicula(String nombrePeliculas);

    void listarPeliculas();

    void  buscarPelicula(String buscar);

    void iniciarCatalogoPelicula();
}
