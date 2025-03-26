package Actividad17;

public class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;

    public Motocicleta(String matricula, String marca, int año, TipoCombustible tipoDeCombustible, boolean tieneSidecar) {
        super(matricula, marca, año, tipoDeCombustible);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public double calcularVelocidad() {
        return 120;
    }

    @Override
    public String toString() {
        return super.toString() + ", tieneSidecar=" + tieneSidecar;
    }
}
