package programacio.ut2;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        double dividir, raizcuadrada;
        int suma, resta, multi;

        while (true) {
            // Menú de opciones
            System.out.println("Calculadora");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. Dividir");
            System.out.println("5. Raíz cuadrada");
            System.out.println("6. Contar hasta");
            System.out.println("7. Para sacar el factorial de un número");
            System.out.println("0. Salir");

            // Leer la opción del usuario
            num1 = scanner.nextInt();

            // Opción para salir
            if (num1 == 0) {
                break;
            }

            switch (num1) {
                case 1:
                    System.out.println("Suma");
                    System.out.print("Primer número: ");
                    num2 = scanner.nextInt();
                    System.out.print("Segundo número: ");
                    num3 = scanner.nextInt();
                    suma = num2 + num3;
                    System.out.println("El resultado es: " + suma);
                    break;

                case 2:
                    System.out.println("Resta");
                    System.out.print("Primer número: ");
                    num2 = scanner.nextInt();
                    System.out.print("Segundo número: ");
                    num3 = scanner.nextInt();
                    resta = num2 - num3;
                    System.out.println("El resultado es: " + resta);
                    break;

                case 3:
                    System.out.println("Multiplicación");
                    System.out.print("Primer número: ");
                    num2 = scanner.nextInt();
                    System.out.print("Segundo número: ");
                    num3 = scanner.nextInt();
                    multi = num2 * num3;
                    System.out.println("El resultado es: " + multi);
                    break;

                case 4:
                    System.out.println("División");
                    System.out.print("Primer número: ");
                    num2 = scanner.nextInt();
                    System.out.print("Segundo número: ");
                    num3 = scanner.nextInt();
                    if (num3 != 0) {
                        dividir = (double) num2 / num3;
                        System.out.println("El resultado es: " + dividir);
                    } else {
                        System.out.println("Error: División por cero.");
                    }
                    break;

                case 5:
                    System.out.println("Raíz cuadrada");
                    System.out.print("Pon un número: ");
                    num2 = scanner.nextInt();
                    if (num2 >= 0) {
                        raizcuadrada = Math.sqrt(num2);
                        System.out.println("El resultado es: " + raizcuadrada);
                    } else {
                        System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
                    }
                    break;

                case 6:
                    contador(scanner);
                    break;

                case 7:
                    factorial(scanner);
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }

    // Función para contar hasta el número dado
    public static void contador(Scanner scanner) {
        System.out.print("¿Hasta qué número quieres contar? ");
        int num2 = scanner.nextInt();
        int cont = 0;
        while (cont <= num2) {
            System.out.println(cont);
            cont++;
        }
    }

    // Función para calcular el factorial de un número
    public static void factorial(Scanner scanner) {
        System.out.print("¿De qué número quieres el factorial? ");
        int num = scanner.nextInt();
        if (num >= 0) {
            int resultado = 1;
            for (int i = 1; i <= num; i++) {
                resultado *= i;
            }
            System.out.println("El factorial de " + num + " es: " + resultado);
        } else {
            System.out.println("Por favor, introduce un número no negativo.");
        }
    }
}

