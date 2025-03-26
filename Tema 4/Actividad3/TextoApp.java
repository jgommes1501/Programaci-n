package Actividad3;

public class TextoApp {
    public static void main(String[] args) {
        Texto texto = new Texto(50);

        texto.anadirAlFinal('H');
        texto.anadirAlFinal('o');
        texto.anadirAlFinal('l');
        texto.anadirAlFinal('a');
        texto.anadirCadenaAlFinal(" Mundo");

        texto.anadirAlPrincipio('¡');
        texto.anadirCadenaAlPrincipio("Saludos a todos, ");

        texto.mostrarInformacion();

        System.out.println("Número de vocales en el texto: " + texto.contarVocales());
    }
}
