package tema3;

public class ejercicio5 {
    public static void main(String[] args) {
        int[] tabla = {1, 2, 3, 4, 5};
        int resultado = sumaArray(tabla);
        System.out.println("La suma es: " + resultado);
    }
    
    public static int sumaArray(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }
}

