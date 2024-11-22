package programacio.ut2;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);
    
        final float PrecioManzana = 2.35f;
        final float PrecioPera= 1.95f;
        float total;
        float kgManzanaSemestre1;
        float kgPerasSemestre1;
        float kgManzanaSemestre2;
        float kgPerasSemestre2;
        
        System.out.println("Ventas 1 semestre de manzanas: ");  
        kgManzanaSemestre1 = scanner.nextFloat();
        System.out.println("Ventas 1 semestre de Peras: ");  
        kgPerasSemestre1 = scanner.nextFloat();
        System.out.println("Ventas 2 semestre de manzanas: ");  
        kgManzanaSemestre2 = scanner.nextFloat();
        System.out.println("Ventas 2 semestre de Peras: ");  
        kgPerasSemestre2 = scanner.nextFloat();
        
        total = PrecioManzana * kgManzanaSemestre1 + PrecioManzana * kgManzanaSemestre2;
        total= total + PrecioPera * kgPerasSemestre1 + PrecioPera * kgPerasSemestre2;
        System.out.println(total);
        
        
        
        
  

    }
    }





























































