package programacio.ut2;
//Cae en el Examen
import java.util.Scanner;
//pedir por consola un número n y dibujar un triangulo rectangulo de n elementos de lado, utiliza para ello asteriscos (*). Por ejemplo n = 4
public class ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("n: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("");
            }
            System.out.println();
            
        }
    }
}
