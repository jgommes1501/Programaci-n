package programacio.ut2;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer número entero: ");
        int numero1 = sc.nextInt();
        
        System.out.print("Introduce el segundo número entero: ");
        int numero2 = sc.nextInt();
        
        if (numero1 == numero2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números no son iguales.");
            
            if (numero1 > numero2) {
                System.out.println("El mayor es: " + numero1);
            } else {
                System.out.println("El mayor es: " + numero2);
            }
        }
        
        sc.close();
    }
}