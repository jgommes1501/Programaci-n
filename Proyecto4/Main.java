package Proyecto4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Laboratorio laboratorio = new Laboratorio();

        Muestra muestra1 = new Muestra(001, "Sangre", 4.5, LocalDate.of(2025, 4, 23));
        Muestra muestra2 = new Muestra(002, "Orina", 7.8, LocalDate.of(2025, 4, 23));
        
        laboratorio.registrarMuestra(muestra1);
        laboratorio.registrarMuestra(muestra2);

        System.out.println("Consulta por fecha:");
        System.out.println(laboratorio.consultarPorFecha(LocalDate.of(2025, 4, 23)));

        System.out.println("Consulta por tipo de analisis:");
        System.out.println(laboratorio.consultarPorTipo("Sangre"));
    }
}