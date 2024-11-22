package programacio.ut2;
import java.util.Scanner;
//Escribir una aplicación que pida el año actuaal y el de nacimiento del usuario. Debe calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido años.
public class ejercicio3 {
    public static void main (String[] args) {
        int actual;
        int date;
        int edad;
        System.out.println("¿Qué año es?");
        Scanner sc = new Scanner(System.in);
        actual = sc.nextInt();
        System.out.println("Año de nacimiento: ");
        date = sc.nextInt();
        edad = actual - date;
        System.out.println("Su edad es: " + edad);
    }
}
