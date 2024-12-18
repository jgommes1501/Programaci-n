package tema3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100) + 1;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número a buscar: ");
        int numero = scanner.nextInt();

        int posicion = buscarNumero(array, numero);
        System.out.println("Posición encontrada por método propio: " + posicion);
        
        Arrays.sort(array);
        int posicionBinarySearch = Arrays.binarySearch(array, numero);
        System.out.println("Posición encontrada por Arrays.binarySearch: " + posicionBinarySearch);
    }

    public static int buscarNumero(int[] array, int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1;
    }
}
