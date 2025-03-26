package Actividad16;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro("Rex", 5);
        Animal pez = new Pez("Nemo", 2);
        Animal pajaro = new Pajaro("Piolin", 3);

        perro.mostrarInformacion();
        ((Corredor)perro).correr(); // Llamamos al método correr para el perro

        pez.mostrarInformacion();
        ((Nadador)pez).nadar(); // Llamamos al método nadar para el pez

        pajaro.mostrarInformacion();
        ((Volador)pajaro).volar(); // Llamamos al método volar para el pájaro

        // Crear un pato que puede volar y nadar
        Animal pato = new Pajaro("Donald", 4);
        ((Volador)pato).volar();
        ((Nadador)pato).nadar();
    }
}
