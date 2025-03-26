package Actividad9;

public class Motocicleta extends Vehiculo {
    boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, int anio, boolean tieneSidecar) {
        super(marca, modelo, anio); 
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();  
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }

    @Override
    public void mover() {
        System.out.println("La motocicleta está en movimiento.");
    }
}
