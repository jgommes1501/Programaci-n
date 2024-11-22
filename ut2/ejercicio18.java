package programacio.ut2;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número decimal: ");
        double numero = sc.nextDouble();
        
        if (numero > -1 && numero < 1 && numero != 0) {
            System.out.println("El número " + numero + " Es casi-cero.");
        } else {
            System.out.println("El número " + numero + " NO es casi-cero.");
        }
        
        sc.close();
    }
}