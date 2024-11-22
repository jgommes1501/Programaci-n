package programacio.ut2;

import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int num1; 
     int ValorA;
     
     System.out.println("Ponga un número: ");
        num1 = scanner.nextInt();
        //Calculo Manual
        //ValorA = num > 0 ? num : (-1) * num;
        
        
        
        ValorA = Math.abs(num1);
        System.out.println("Valor Absoluto es: " + ValorA);
    }
}
