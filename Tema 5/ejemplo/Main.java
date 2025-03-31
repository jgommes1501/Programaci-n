package ejemplo;

import java.util.HashSet;
import java.util.Set;

class Main {

	public static void main(String[] args) {
		Set<Integer> naturales = new HashSet<>();
		naturales.add(1);
	
		naturales.add(1);
		naturales.add(2);
		naturales.add(3);
		naturales.add(4);
		System.out.println("Naturale: " + naturales);
		System.out.println("Naturales referencia: " + naturales.hashCode());
		
		HashSet<Integer> naturales2 = new HashSet<>();
		naturales2.add(1);
		naturales2.add(2);
		naturales2.add(3);
		naturales2.add(4);
		System.out.println("Naturale: " + naturales2);
		System.out.println("Naturales referencia: " + naturales2.hashCode());
		
		System.out.println(naturales == naturales2);
		}
}