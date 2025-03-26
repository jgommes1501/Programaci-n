package Actividad7;

class Vagon {
    private int numero;
    private double cargaMaxima;
    private double cargaActual;
    private String tipoMercancia;

    public Vagon(int numero, double cargaMaxima, double cargaActual, String tipoMercancia) {
        this.numero = numero;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }

    public int getNumero() {
        return numero;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public String getTipoMercancia() {
        return tipoMercancia;
    }

    public void cargarMercancia(double carga) {
        if (cargaActual + carga <= cargaMaxima) {
            cargaActual += carga;
        } else {
            System.out.println("Exceso de carga. No se puede cargar más.");
        }
    }

    public void descargarMercancia(double carga) {
        if (cargaActual - carga >= 0) {
            cargaActual -= carga;
        } else {
            System.out.println("No hay suficiente carga para descargar.");
        }
    }
}