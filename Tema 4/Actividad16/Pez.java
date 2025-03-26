package Actividad16;

public class Pez extends Animal implements Nadador {

    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Glub glub");
    }

    @Override
    public void nadar() {
        System.out.println("El pez está nadando.");
    }
}
