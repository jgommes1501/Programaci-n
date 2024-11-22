package programacio.ut2;

//Diseñar una función que recibe como parámetros dos números enteros y devuelve el máximo de ambos. Imprimir el valor devuelto por la fonción dentro del codigo de la función main.
public class ejercicio32 {

    public static void main(String[] args) {
        System.out.println(maximo(10,20));
    }

    public static int maximo(int x, int y) {
        return x > y ? x : y; 
 
    }
        }


