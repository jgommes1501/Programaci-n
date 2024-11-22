package programacio.ut2;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
        
        sc.close();
    }
}