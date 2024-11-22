package programacio.ut2;

import java.util.Scanner;

public class ejercicio11 {
     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
        int num1;
        int num2;
        int MayorMenor;
          
        System.out.println("Primer Número");
        num1 = scanner.nextInt();
        
        System.out.println("Segundo Número");
        num2 = scanner.nextInt();
         
        MayorMenor = num1 > num2 ? num1 : num2 ;
        System.out.println("Este es el mayor: " + MayorMenor );
        
    }
}