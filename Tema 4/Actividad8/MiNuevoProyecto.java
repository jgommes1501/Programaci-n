package Actividad8;

import CalculadoraBasica;

public class MiNuevoProyecto {
    public static void main(String[] args) {
        // Usar los métodos estáticos de la CalculadoraBasica
        int resultadoSuma = CalculadoraBasica.sumar(5, 3);
        System.out.println("Resultado de la suma: " + resultadoSuma);
        
        int resultadoResta = CalculadoraBasica.restar(5, 3);
        System.out.println("Resultado de la resta: " + resultadoResta);

        double resultadoDivision = CalculadoraBasica.dividir(5, 2);
        System.out.println("Resultado de la división: " + resultadoDivision);
    }
}
