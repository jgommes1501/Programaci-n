package Actividad17;

import java.time.LocalDate;

public abstract class Vehiculo implements Mantenimiento {
    private String matricula;
    private String marca;
    private int año;
    private TipoCombustible tipoDeCombustible;
    private static int totalVehiculos = 0;

    public Vehiculo(String matricula, String marca, int año, TipoCombustible tipoDeCombustible) {
        this.matricula = matricula;
        this.marca = marca;
        this.año = año;
        this.tipoDeCombustible = tipoDeCombustible;
        totalVehiculos++;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public TipoCombustible getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(TipoCombustible tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public abstract double calcularVelocidad();

    @Override
    public LocalDate obtenerFechaProximoMantenimiento() {
        return LocalDate.now().plusMonths(6); 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) obj;
        return matricula.equals(vehiculo.matricula);
    }

    @Override
    public String toString() {
        return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", año=" + año + ", tipoDeCombustible=" + tipoDeCombustible + "]";
    }

    public static int obtenerTotalVehiculos() {
        return totalVehiculos;
    }
}
