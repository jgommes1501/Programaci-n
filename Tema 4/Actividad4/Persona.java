package Actividad4;

public class Persona {
    private String nombre;
    private String apellido;

    // Constructor que recibe el nombre
    public Persona(String nombre) {
        this.nombre = nombre;
        this.apellido = "";
    }

    // Constructor que recibe nombre y apellido
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre no puede ser vacío.");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.isEmpty()) {
            this.apellido = apellido;
        } else {
            System.out.println("Apellido no puede ser vacío.");
        }
    }

    public String obtenerNombreCompleto() {
        return nombre + " " + apellido;
    }
}
