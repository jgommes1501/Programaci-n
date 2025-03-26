package Actividad16;

public class Pajaro extends Animal implements Volador {

    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Pío pío");
    }

    @Override
    public void volar() {
        System.out.println("El pájaro está volando.");
    }
}
