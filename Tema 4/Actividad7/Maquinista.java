package Actividad7;

public class Maquinista {
    private String nombre;
    private String DNI;
    private double sueldo;
    private String rango;

    public Maquinista(String nombre, String DNI, double sueldo, String rango) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getRango() {
        return rango;
    }
}