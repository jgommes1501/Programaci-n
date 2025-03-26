package Actividad11;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private int anioPublicacion;

    public Libro(String titulo, String autor, String isbn, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Año: " + anioPublicacion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        Libro otroLibro = (Libro) obj;
        return this.isbn.equals(otroLibro.isbn);
    }

    public String getIsbn() {
        return isbn;
    }
}
