package Actividad12;

public class Main {
    public static void main(String[] args) {
        // Crear un array de Animal con al menos una instancia de cada animal
        Animal[] animales = new Animal[3];

        // Crear instancias de Perro, Gato y Pajaro
        animales[0] = new Perro("Rex", 5);
        animales[1] = new Gato("Whiskers", 3);
        animales[2] = new Pajaro("Tweety", 2);

        // Recorrer el array y llamar al método mostrarInformacion() para cada animal
        for (Animal animal : animales) {
            animal.mostrarInformacion();
            // Si el animal es un Pajaro, invocar el método volar()
            if (animal instanceof Pajaro) {
                ((Pajaro) animal).volar(); // Cast a Pajaro para llamar el método volar
            }
        }
    }
}
