package programacio.ut2;

import java.util.Random;

import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int operacionesCorrectas = 0;
        boolean Correcta = true;

        do {
            int num1 = random.nextInt(100);
            int num2 = random.nextInt(100);

            System.out.println(+ num1 + " + " + num2 );
            int respuesta = sc.nextInt();

            if (respuesta == (num1 + num2)) {
                operacionesCorrectas++;
            } else {
                Correcta = false;
            }
        } while (Correcta);

        
    }
}