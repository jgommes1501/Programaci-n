package Actividad15;

public class Main {

    public static void main(String[] args) {
        int valorPrimitivo = 5;
        StringBuilder valorObjeto = new StringBuilder("Hola");
        
        System.out.println("Antes de llamar al método, valorPrimitivo = " + valorPrimitivo);
        ComparacionParametros.modificarPrimitivo(valorPrimitivo);
        System.out.println("Después de llamar al método, valorPrimitivo = " + valorPrimitivo);
        
        System.out.println("\nAntes de llamar al método, valorObjeto = " + valorObjeto);
        ComparacionParametros.modificarObjeto(valorObjeto);
        System.out.println("Después de llamar al método, valorObjeto = " + valorObjeto);
    }
}
