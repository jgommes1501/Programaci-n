package Actividad3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Texto {
    private String texto;
    private int longitudMaxima;
    private Date fechaCreacion;
    private Date fechaUltimaModificacion;

    public Texto(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
        this.texto = "";
        this.fechaCreacion = new Date();
        this.fechaUltimaModificacion = new Date();
    }

    public boolean anadirAlFinal(char c) {
        if (texto.length() < longitudMaxima) {
            texto += c;
            actualizarFechaUltimaModificacion();
            return true;
        }
        return false;
    }

    public boolean anadirAlPrincipio(char c) {
        if (texto.length() < longitudMaxima) {
            texto = c + texto;
            actualizarFechaUltimaModificacion();
            return true;
        }
        return false;
    }

    public boolean anadirCadenaAlFinal(String cadena) {
        if (texto.length() + cadena.length() <= longitudMaxima) {
            texto += cadena;
            actualizarFechaUltimaModificacion();
            return true;
        }
        return false;
    }

    public boolean anadirCadenaAlPrincipio(String cadena) {
        if (texto.length() + cadena.length() <= longitudMaxima) {
            texto = cadena + texto;
            actualizarFechaUltimaModificacion();
            return true;
        }
        return false;
    }

    public int contarVocales() {
        int contador = 0;
        for (char c : texto.toCharArray()) {
            if (esVocal(c)) {
                contador++;
            }
        }
        return contador;
    }

    private boolean esVocal(char c) {
        char letra = Character.toLowerCase(c);
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }

    private void actualizarFechaUltimaModificacion() {
        this.fechaUltimaModificacion = new Date();
    }

    public void mostrarInformacion() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Texto: " + texto);
        System.out.println("Fecha de creación: " + sdf.format(fechaCreacion));
        System.out.println("Última modificación: " + sdf.format(fechaUltimaModificacion));
        System.out.println("Número de vocales: " + contarVocales());
        System.out.println("Longitud máxima: " + longitudMaxima);
    }
}
