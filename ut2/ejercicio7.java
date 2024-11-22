package programacio.ut2;

import java.util.Scanner;

public class ejercicio7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        boolean esMayorDeEdad = edad >= 18;
        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
        scanner.close();
    }
}    

