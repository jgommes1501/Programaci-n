package Actividad16;

public class Perro extends Animal implements Corredor {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }

    @Override
    public void correr() {
        System.out.println("El perro está corriendo.");
    }
}
