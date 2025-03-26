package Actividad17;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Coche y Motocicleta
        Coche coche1 = new Coche("1234ABC", "Toyota", 2020, TipoCombustible.GASOLINA, 4);
        Motocicleta moto1 = new Motocicleta("5678XYZ", "Harley", 2022, TipoCombustible.DIESEL, false);

        // Mostrar detalles de los vehículos
        System.out.println(coche1);
        System.out.println("Velocidad del coche: " + coche1.calcularVelocidad() + " km/h");
        System.out.println("Próximo mantenimiento del coche: " + coche1.obtenerFechaProximoMantenimiento());

        System.out.println("\n" + moto1);
        System.out.println("Velocidad de la motocicleta: " + moto1.calcularVelocidad() + " km/h");
        System.out.println("Próximo mantenimiento de la motocicleta: " + moto1.obtenerFechaProximoMantenimiento());

        // Verificar el contador de vehículos
        System.out.println("\nTotal de vehículos creados: " + Vehiculo.obtenerTotalVehiculos());
    }
}
