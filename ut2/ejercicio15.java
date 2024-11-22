package programacio.ut2;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número decimal: ");
        double numeroDecimal = sc.nextDouble();
        
        long numeroRedondeado = Math.round(numeroDecimal);
        
        System.out.println("El número redondeado es: " + numeroRedondeado);
        
        sc.close();
    }
}
