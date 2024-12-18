package tema3;

import java.util.Arrays;

public class ejercicio14 {
    public static void main(String[] args) {
		
		int[] original = {18,21,19,18,20};

		int[] destino = new int[original.length];
		
		for(int i = 0; i < original.length; i++) {
			destino[i] = original[i];
		}
		System.out.println(Arrays.toString(destino));
		
		System.out.println(ejercicio13.compararArrays(original, destino));
		
	}

}
