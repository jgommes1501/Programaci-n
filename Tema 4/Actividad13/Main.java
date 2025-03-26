package Actividad13;

public class Main {
    public static void main(String[] args) {
        System.out.println("Área del círculo: " + MatematicasUtil.calcularAreaCirculo(5));

        System.out.println("¿Es 17 primo? " + MatematicasUtil.esPrimo(17));

        System.out.println("Factorial de 5: " + MatematicasUtil.factorial(5));

        System.out.println("Perímetro del rectángulo: " + MatematicasUtil.calcularPerimetroRectangulo(4, 6));

        System.out.println("Número redondeado: " + MatematicasUtil.redondearDecimal(3.14159, 2));
    }
}
