package tema3;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos números deseas introducir? ");
        int cantidad = scanner.nextInt();
        
        int[] numeros = new int[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Los números en orden inverso son:");
        for (int i = cantidad - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
