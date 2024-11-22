package programacio.ut2;

import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int edadMinima;
        int edadMaxima;
        
        int edad;

        System.out.println("Introduce las edades de los alumnos. Escribe -1 para terminar.");
        
        while (i != -1) {
            System.out.print("Introduce la edad: ");
            edad = sc.nextInt();
            
            if (edadMinima<edad) {
            max = i
            }
            
            if (edad < 0) {
                System.out.println("Edad no válida. Introduce una edad positiva.");
                continue;
            }

            if (edad < edadMinima) {
                edadMinima = edad;
            }
            if (edad > edadMaxima) {
                edadMaxima = edad;
            }
        }
        
        if (edadMinima == Integer.MAX_VALUE || edadMaxima == Integer.MIN_VALUE) {
            System.out.println("No se introdujeron edades.");
        } else {
            System.out.println("La edad mínima es: " + edadMinima);
            System.out.println("La edad máxima es: " + edadMaxima);
        }
        
        sc.close();
    }
}