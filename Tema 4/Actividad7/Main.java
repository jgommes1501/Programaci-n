package Actividad7;

import maquinaria.*;
import Actividad7.*;

public class Main {
    public static void main(String[] args) {
        // Crear objetos necesarios
        Mecanico mecanico1 = new Mecanico("Carlos", "123456789", "Frenos");
        Locomotora locomotora = new Locomotora("ABC123", 5000, 10, mecanico1);
        Maquinista maquinista = new Maquinista("Juan", "987654321", 3000, "Rango 1");

        // Crear tren
        Tren tren = new Tren(locomotora, maquinista);

        // Crear vagones
        Vagon vagon1 = new Vagon(1, 10000, 5000, "Electrónica");
        Vagon vagon2 = new Vagon(2, 15000, 8000, "Ropa");

        // Enganchar vagones al tren
        tren.engancharVagon(vagon1);
        tren.engancharVagon(vagon2);

        // Mostrar información del tren
        tren.mostrarInformacionTren();

        // Desenganchar un vagón
        tren.desengancharVagon(vagon1);

        // Mostrar la información del tren después del desenganche
        tren.mostrarInformacionTren();
    }
}
