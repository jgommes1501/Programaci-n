package Actividad7;

public class Mecanico {
    private String nombre;
    private String telefono;
    private String especialidad;

    public Mecanico(String nombre, String telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}