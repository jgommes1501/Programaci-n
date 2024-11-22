package programacio.ut2;

import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        int num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce una Nota: ");
        num = sc.nextInt();
                
        switch (num){
        case 1, 2, 3, 4:
            System.out.println("Insuficiente ");
        break;
        case 5:
           System.out.println("Suficiente ");
           
        case 6:
            System.out.println("Bien ");
        break;
           
        case 7, 8:
            System.out.println("Notable ");
        break; 
        
        case 9, 10:
            System.out.println("Sobresaliente ");
        break;
           
}
    }
        }