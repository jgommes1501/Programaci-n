package Actividad9;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 2020, 4);

        Motocicleta motocicleta = new Motocicleta("Harley-Davidson", "Sportster", 2019, true);

        Camion camion = new Camion("Volvo", "FMX", 2021, 12.5);

        System.out.println("Detalles del coche:");
        coche.mostrarDetalles();
        System.out.println();

        System.out.println("Detalles de la motocicleta:");
        motocicleta.mostrarDetalles();
        System.out.println();

        System.out.println("Detalles del camión:");
        camion.mostrarDetalles();
        System.out.println();


        coche.mover();
        motocicleta.mover();
        camion.mover();
    }
}
