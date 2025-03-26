package Actividad12;

public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau miau");
    }

    @Override
    public String moverse() {
        return "Se desliza sigilosamente";
    }
}
