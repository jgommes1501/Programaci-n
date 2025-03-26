package Actividad9;

public class Vehiculo {
    String marca;
    String modelo;
    int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
    }

    public void mover() {
        System.out.println("El vehículo está en movimiento.");
    }
}
