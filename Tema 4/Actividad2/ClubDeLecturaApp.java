package Actividad2;

	public class ClubDeLecturaApp {
	    public static void main(String[] args) {
	        Libro libro1 = new Libro("1984", "George Orwell", 1949, 328);
	        Libro libro2 = new Libro("El Alquimista", "Paulo Coelho");

	        Miembro miembro1 = new Miembro("Juan", 30, libro1);
	        Miembro miembro2 = new Miembro("Ana");

	        miembro2.asignarLibroFavorito(libro2);

	        if (libro1.esMasExtenso(libro2)) {
	            System.out.println(libro1.obtenerInformacion() + " es más extenso que " + libro2.obtenerInformacion());
	        } else {
	            System.out.println(libro2.obtenerInformacion() + " es más extenso que " + libro1.obtenerInformacion());
	        }

	        System.out.println("\nInformación de los miembros:");
	        System.out.println(miembro1.obtenerInformacion());
	        System.out.println(miembro2.obtenerInformacion());
	    }
	}


