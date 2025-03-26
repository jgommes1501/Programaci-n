package Actividad11;

public class Main {
    public static void main(String[] args) {
        // Crear varios objetos Libro
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-3-16-148410-0", 1967);
        Libro libro2 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", "978-3-16-148410-0", 1985);
        Libro libro3 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-3-16-148411-7", 1605);

        // Imprimir cada libro usando el método toString()
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());

        // Comparar dos libros con el mismo ISBN y verificar si equals() devuelve true
        System.out.println("\nComparando libro1 y libro2: " + libro1.equals(libro2)); // Debería devolver true (mismo ISBN)

        // Comparar dos libros con ISBN diferentes y verificar si equals() devuelve false
        System.out.println("Comparando libro1 y libro3: " + libro1.equals(libro3)); // Debería devolver false (ISBN diferente)
    }
}
