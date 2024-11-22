package programacio.ut2;

import java.util.Scanner;
//Pedir el número del mes en el año y decir cuántos días tiene ese mes
public class ejercicio21 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el número del mes (1-12): ");
        int mes = scanner.nextInt();
        int dias;

        dias = switch (mes) {
           
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 31;
                
        };

        System.out.println("El mes " + mes + " tiene " + dias + " días.");
    }
}