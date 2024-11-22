package programacio.ut2;

import java.util.Scanner;

public class ej29refuerzo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int etiqueta = 0; 
        int alturaMaxima = -1; 
        int etiquetaMaxima = -1; 
        
        while (true) {

            System.out.print("Introduce la altura del árbol " + etiqueta + " (en centímetros, -1 para terminar): ");
            int altura = scanner.nextInt();
            
            if (altura == -1) {
                break;
            }
            if (altura > alturaMaxima) {
                alturaMaxima = altura;
                etiquetaMaxima = etiqueta;
            }

            etiqueta++;
        }

        if (etiquetaMaxima != -1) {
            System.out.println("El árbol más alto es el árbol " + etiquetaMaxima + " con una altura de " + alturaMaxima + " cm.");
        } else {
            System.out.println("No se ingresaron datos de árboles.");
        }

        scanner.close();
    }
}

}
