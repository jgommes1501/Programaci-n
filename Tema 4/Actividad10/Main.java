package Actividad10;

public class Main {
    public static void main(String[] args) {
        // Crear un array de tamaño 2 y tipo Figura
        Figura[] figuras = new Figura[2];

        // Crear instancias de Circulo y Rectangulo
        figuras[0] = new Circulo("Círculo", 5.0);
        figuras[1] = new Rectangulo("Rectángulo", 4.0, 6.0);

        // Recorrer el array y llamar a los métodos mostrarInformacion() y calcularArea()
        for (Figura figura : figuras) {
            figura.mostrarInformacion();
            System.out.println("Área: " + figura.calcularArea());
            System.out.println(); 
        }
    }
}
