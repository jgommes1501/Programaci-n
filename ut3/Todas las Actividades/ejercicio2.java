package tema3;

public class ejercicio2 {
    public static void main(String[] args) {
        int[] tabla1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] tabla2 = tabla1;
        int[] tabla3 = tabla1;
        int[] tabla4 = tabla1;
        
        System.out.println(tabla1 == tabla2);
        System.out.println(tabla1 == tabla3);
        System.out.println(tabla1 == tabla4);
        System.out.println(tabla2 == tabla3);
        System.out.println(tabla2 == tabla4);
        System.out.println(tabla3 == tabla4);
    }
}

