package programacio.ut2;

import java.util.Scanner;

public class ejercicio14 {
  public static void main(String[] args) {
         int nota1;
         int nota2;
         int nota3;
         double media;
         
         Scanner sc = new Scanner (System.in);
         
         System.out.println("introduzca las notas de sus tres trimestres");
         
         nota1 = sc.nextInt();
         nota2 = sc.nextInt();
         nota3 = sc.nextInt();
 
         media = (nota1 + nota2 + nota3) / 3.0;
         
        System.out.println("La media es " + media);
       
        int x = (int)media;
       
         System.out.println("La media es " + x);
    }
}    
