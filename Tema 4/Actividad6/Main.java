package Actividad6;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Pérez", Sexo.HOMBRE);
        Persona persona2 = new Persona("María", "Gómez", Sexo.MUJER);

        persona1.mostrarInformacion();
        persona2.mostrarInformacion();
    }
}

