package Actividad5;

public class ContadorObjetos {
    private static int totalObjetos = 0;
    
    public ContadorObjetos() {
        totalObjetos++;
    }

    public static void mostrarTotalObjetos() {
        System.out.println("Total de objetos creados: " + totalObjetos);
    }
}
