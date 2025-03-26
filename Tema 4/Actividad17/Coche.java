package Actividad17;

public final class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String matricula, String marca, int año, TipoCombustible tipoDeCombustible, int numPuertas) {
        super(matricula, marca, año, tipoDeCombustible);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public double calcularVelocidad() {
        return 180; 
    }

    @Override
    public String toString() {
        return super.toString() + ", numPuertas=" + numPuertas;
    }
}
