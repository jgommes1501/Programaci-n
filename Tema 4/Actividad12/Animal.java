package Actividad12;

public abstract class Animal {
 protected String nombre;
 protected int edad;

 public Animal(String nombre, int edad) {
     this.nombre = nombre;
     this.edad = edad;
 }

 public abstract void hacerSonido();

 public abstract String moverse();

 public void mostrarInformacion() {
     System.out.println("Nombre: " + nombre + ", Edad: " + edad);
     hacerSonido();
     System.out.println(moverse());
     System.out.println();
 }
}
