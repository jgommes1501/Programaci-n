package Actividad16;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void hacerSonido();
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
        hacerSonido();
    }
}
