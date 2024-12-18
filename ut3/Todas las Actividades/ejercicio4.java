package tema3;

public class ejercicio4 {
    public static void main(String[] args) {
        int[] tabla = new int[10];
        int suma = 0;
        
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int)(Math.random() * 100) + 1;
            suma += tabla[i];
        }
        
        System.out.println("La suma de los números aleatorios es: " + suma);
    }
}