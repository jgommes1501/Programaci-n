package programacio.ut2;

import java.util.Scanner;

public class EntradaDatos {
    public static void main (String[] args) {
        int num;
        System.out.println("Escribe un número");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("El número es: " + num);
    }
    
}
