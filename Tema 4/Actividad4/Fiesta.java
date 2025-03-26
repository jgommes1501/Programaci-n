package Actividad4;

public class Fiesta {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        persona.setApellido("Pérez");

        // Intentamos modificar el nombre de la persona
        persona.setNombre("Carlos");
        System.out.println("Nombre completo: " + persona.obtenerNombreCompleto());
    }
}
