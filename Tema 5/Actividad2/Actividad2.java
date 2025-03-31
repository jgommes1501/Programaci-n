package Actividad2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Actividad2 {
	public static void main(String[] args) {
		Set<String> nombresLH = new LinkedHashSet<>();
		Set<String> nombresH = new HashSet<>();

			nombresLH.add("Fran");
			nombresLH.add("Mario");
			nombresLH.add("Adrian");
			nombresLH.add("Jaime");
			System.out.println(nombresLH);
			boolean agregar = nombresLH.add("Fran");
			System.out.println(agregar);
			System.out.println(nombresLH);
			System.out.println("Tamaño: "+nombresLH.size());
			nombresLH.add(null);
			System.out.print(nombresLH);
			
			System.out.println("Elementos en orden de inserción:");
	        for (String nombre : nombresLH) {
	            System.out.println("D ."+ nombre);
			
	    }
	        nombresH.addAll(nombresLH);
	        System.out.println("HashSet:");
	        for (String nombre : nombresH) {
	            System.out.println("D. "+ nombre);
	        }
	}
}