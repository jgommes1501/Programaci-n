package Actividad4;

import java.util.Scanner;

public class RelojApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la hora (formato: hh mm ss): ");
        int hora = scanner.nextInt();
        int minuto = scanner.nextInt();
        int segundo = scanner.nextInt();

        System.out.println("Introduce el número de segundos a avanzar: ");
        int n = scanner.nextInt();

        Hora horaActual = new Hora(hora, minuto, segundo);

        // Mostrar la hora inicial
        System.out.print("Hora inicial: ");
        horaActual.mostrarHora();

        // Avanzar n segundos
        for (int i = 0; i < n; i++) {
            horaActual.avanzarSegundo();
        }

        // Mostrar la hora después de avanzar
        System.out.print("Hora después de avanzar " + n + " segundos: ");
        horaActual.mostrarHora();
    }
}
