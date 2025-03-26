package Actividad2;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int numPaginas;
    
    public Libro(String titulo, String autor, int anioPublicacion, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.numPaginas = numPaginas;
    }

    public Libro(String titulo, String autor) {
        this(titulo, autor, 0, 0);
    }

    public String obtenerInformacion() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año: " + anioPublicacion + ", Páginas: " + numPaginas;
    }

    public boolean esMasExtenso(Libro otroLibro) {
        return this.numPaginas > otroLibro.numPaginas;
    }
}
