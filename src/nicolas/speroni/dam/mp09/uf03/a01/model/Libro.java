package nicolas.speroni.dam.mp09.uf03.a01.model;

import java.io.Serializable;

public class Libro implements Serializable {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro [Título=" + titulo + ", Autor=" + autor + "]";
    }
}
