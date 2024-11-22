package programacio.ut2;

import java.util.Scanner;
//pedir tres numero y mostraloss ordanados de mayor a menor
public class ejercicio19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Introduce el tercer número: ");
        double num3 = sc.nextDouble();
    
        if (num1 > num2 && num1 > num3);
            System.out.print("Números Ordenados: "+ num1 +","+ num2 +","+ num3);
        else {
            if (num1 > num3 &&  num1 > num2);
            System.out.print("Números Ordenados: "+ num1 +","+ num3 +","+ num2);
        else {
            if (num2 > num1 && num2 > num3);
            System.out.print("Números Ordenados: "+ num2 +","+ num1 +","+ num3);
        else {
            if (num2 > num3 && num2 > num1);
            System.out.print("Números Ordenados: "+ num2 +","+ num3 +","+ num1);
        else {
            if (num3 > num1 && num3 > num2);
            System.out.print("Números Ordenados: "+ num3 +","+ num1 +","+ num2);
        else {
            if (num3 > num2 && num3 > num1);
            System.out.print("Números Ordenados: "+ num3 +","+ num2 +","+ num1);
               
        }
 }
