package programacio.ut2;
import java.util.Scanner;

public class ejercicio6 {
    
    private static final double PI = Math.PI;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        double longitud = 2 * PI * radio;
        double area = PI * Math.pow(radio, 2);
        System.out.printf("La longitud de la circunferencia es: ", longitud);
        System.out.printf("El área de la circunferencia es: ", area);

        scanner.close();
    }
}