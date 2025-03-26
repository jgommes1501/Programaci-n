package Actividad6;

public class Persona {
    private String nombre;
    private String apellido;
    private Sexo sexo; 

    public Persona(String nombre, String apellido, Sexo sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public void mostrarInformacion() {
        String genero = sexo == Sexo.HOMBRE ? "Hombre" : "Mujer";
        System.out.println("Nombre: " + nombre + " " + apellido + ", Sexo: " + genero);
    }
}
