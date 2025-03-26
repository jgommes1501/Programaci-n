package Actividad7;

import java.util.Date;

public class JefeEstacion {
    private String nombre;
    private String DNI;
    private Date fechaNombramiento;

    public JefeEstacion(String nombre, String DNI, Date fechaNombramiento) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNombramiento = fechaNombramiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public Date getFechaNombramiento() {
        return fechaNombramiento;
    }
}