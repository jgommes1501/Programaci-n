package tema3;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce la primera frase: ");
        String frase1 = scanner.nextLine();
        
        System.out.print("Introduce la segunda frase: ");
        String frase2 = scanner.nextLine();
        
        if (frase1.length() < frase2.length()) {
            System.out.println("La frase más corta es: " + frase1);
        } else if (frase2.length() < frase1.length()) {
            System.out.println("La frase más corta es: " + frase2);
        } else {
            System.out.println("Ambas frases tienen la misma longitud.");
        }
    }
}
