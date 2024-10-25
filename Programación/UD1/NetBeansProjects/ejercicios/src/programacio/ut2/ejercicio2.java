package programacio.ut2;
import java.util.Scanner;

public class ejercicio2 {
    public static void main (String[] args) {
        int num;
        System.out.println("¿Cuántos años tienes?");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Su edad es: " + ++num);
    }
}    
