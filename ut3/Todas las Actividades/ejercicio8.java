package tema3;

public class ejercicio8 {
    public static void main(String[] args) {
        int[] t = {5, 12, 7, 20, 9};
        int max = maximo(t);
        System.out.println("El valor máximo es: " + max);
    }

    public static int maximo(int[] t) {
        int max = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }
        return max;
    }
}
