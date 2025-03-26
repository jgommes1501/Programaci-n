package Actividad9;

public class Camion extends Vehiculo {
	
    double capacidadCarga;  

    public Camion(String marca, String modelo, int anio, double capacidadCarga) {
        super(marca, modelo, anio); 
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();  
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
    }

    @Override
    public void mover() {
        System.out.println("El camión está en movimiento.");
    }
}
