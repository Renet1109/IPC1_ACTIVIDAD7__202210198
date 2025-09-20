
package Serialización;

import java.io.Serializable;

public class Libros implements Serializable {
    private static final long serialVersionUID = 1L;

    private String titulo;
    private String autor;
    private int anio;

    public Libros(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Año: " + anio;
    }
}