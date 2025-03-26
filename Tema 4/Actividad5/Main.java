package Actividad5;

public class Main {
    public static void main(String[] args) {
        ContadorObjetos obj1 = new ContadorObjetos();
        ContadorObjetos obj2 = new ContadorObjetos();
        ContadorObjetos obj3 = new ContadorObjetos();
        
        ContadorObjetos.mostrarTotalObjetos();
        
        ContadorObjetos obj4 = new ContadorObjetos();
        
        ContadorObjetos.mostrarTotalObjetos();
    }
}
