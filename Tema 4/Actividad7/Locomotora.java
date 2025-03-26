package Actividad7;

import Actividad7.Mecanico;

public class Locomotora {
    private String matricula;
    private double potencia;
    private int antiguedad;
    private Mecanico mecanicoEncargado;

    public Locomotora(String matricula, double potencia, int antiguedad, Mecanico mecanicoEncargado) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.antiguedad = antiguedad;
        this.mecanicoEncargado = mecanicoEncargado;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getPotencia() {
        return potencia;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public Mecanico getMecanicoEncargado() {
        return mecanicoEncargado;
    }
}