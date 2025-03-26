package Actividad1;

public class Persona {
    private String nombre;
    private int edad;
    private double estatura;
    
    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public void cumplirAnios() {
        edad++;
    }

    public void crecer(double incremento) {
        estatura += incremento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
    }
    
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 25, 1.75);
        persona.mostrarInfo();
        persona.cumplirAnios();
        persona.crecer(0.05);
        System.out.println("\nDespués de cumplir años y crecer:");
        persona.mostrarInfo();
    }
}
