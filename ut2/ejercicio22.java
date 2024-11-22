package programacio.ut2;

import java.util.Scanner;
//Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivio y su cuadrado. El preceso se repetirá hasta que el número introducido sea 0.
public class ejercicio22 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = -1;  

        while (num != 0) {
            System.out.print("Introduce un número (0 para terminar): ");
            num = sc.nextInt();
            
            if (num != 0) {
                System.out.println("Número ingresado: " + num);
                
    
                if (num % 2 == 0) {
                    System.out.println("El número es par.");
                } else {
                    System.out.println("El número es impar.");
                }
        
                if (num > 0) {
                    System.out.println("El número es positivo.");
                } else if (num < 0) {
                    System.out.println("El número es negativo.");
                }
                
            
                int cuadrado = num * num;
                System.out.println("El cuadrado del número es: " + cuadrado);
            }
        }
        

        sc.close();
        
        System.out.println("Programa terminado.");
    }
}