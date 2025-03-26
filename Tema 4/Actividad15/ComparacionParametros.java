package Actividad15;

public class ComparacionParametros {
    
    public static void modificarPrimitivo(int numero) {
        numero = numero * 2;
        System.out.println("Dentro del método, numero = " + numero);
    }
    
    public static void modificarObjeto(StringBuilder texto) {
        texto.append(" modificado");
        System.out.println("Dentro del método, texto = " + texto);
    }
}
