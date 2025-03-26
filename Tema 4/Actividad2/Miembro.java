package Actividad2;

public class Miembro {
    private String nombre;
    private int edad;
    private Libro libroFavorito;

    public Miembro(String nombre, int edad, Libro libroFavorito) {
        this.nombre = nombre;
        this.edad = edad;
        this.libroFavorito = libroFavorito;
    }

    public Miembro(String nombre) {
        this(nombre, 0, null);
    }

    public void asignarLibroFavorito(Libro libro) {
        this.libroFavorito = libro;
    }

    public String obtenerInformacion() {
        String infoLibroFavorito = (libroFavorito != null) ? libroFavorito.obtenerInformacion() : "Libro Favorito: Ninguno";
        return "Nombre: " + nombre + ", Edad: " + edad + ", " + infoLibroFavorito;
    }
}
