package Actividad13;

public final class MatematicasUtil {

    public static final double PI = 3.141592653589793;

    public static double calcularAreaCirculo(double radio) {
        return PI * radio * radio;
    }

    public static double calcularPerimetroRectangulo(double largo, double ancho) {
        return 2 * (largo + ancho);
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static double redondearDecimal(double numero, int decimales) {
        double factor = Math.pow(10, decimales);
        return Math.round(numero * factor) / factor;
    }
}
