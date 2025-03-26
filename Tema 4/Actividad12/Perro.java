package Actividad12;

public class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau guau");
    }

    @Override
    public String moverse() {
        return "Corre en cuatro patas";
    }
}
