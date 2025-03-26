package Actividad7;

import Actividad7.Maquinista;
import java.util.ArrayList;

public class Tren {
    private Locomotora locomotora;
    private Maquinista maquinistaResponsable;
    private ArrayList<Vagon> vagones;

    public Tren(Locomotora locomotora, Maquinista maquinistaResponsable) {
        this.locomotora = locomotora;
        this.maquinistaResponsable = maquinistaResponsable;
        this.vagones = new ArrayList<>();
    }

    public void engancharVagon(Vagon vagon) {
        if (vagones.size() < 5) {
            vagones.add(vagon);
            System.out.println("Vagón " + vagon.getNumero() + " ha sido enganchado.");
        } else {
            System.out.println("No se puede añadir más vagones. El tren ya tiene el máximo.");
        }
    }

    public void desengancharVagon(Vagon vagon) {
        if (vagones.remove(vagon)) {
            System.out.println("Vagón " + vagon.getNumero() + " ha sido desenganchado.");
        } else {
            System.out.println("El vagón no está presente en el tren.");
        }
    }

    public void mostrarInformacionTren() {
        System.out.println("Tren con locomotora matrícula: " + locomotora.getMatricula());
        System.out.println("Maquinista responsable: " + maquinistaResponsable.getNombre());
        System.out.println("Vagones del tren:");
        for (Vagon vagon : vagones) {
            System.out.println("Vagón " + vagon.getNumero() + ", Carga actual: " + vagon.getCargaActual() + " kg");
        }
    }
}