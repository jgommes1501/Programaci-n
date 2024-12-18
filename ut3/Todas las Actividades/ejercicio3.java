package tema3;

public class ejercicio3 {
    public static void main(String[] args) {
        double[] sueldos = {1800, 1200, 2000, 1200, 900};
        
        for (int i = 0; i < sueldos.length; i++) {
            sueldos[i] += sueldos[i] * 0.10;
        }
        
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Empleado " + (i + 1) + ": " + sueldos[i]);
        }
    }
}

