package programacio.ut2;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        int nota1;
        int nota2;
        double media;
                
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la primera nota: ");
        nota1 = scanner.nextInt();

        System.out.print("Introduce la segunda nota: ");
        nota2 = scanner.nextInt();

        media = (nota1 + nota2) / 2;

        System.out.println("La media aritmética es: " + media);
    }
}