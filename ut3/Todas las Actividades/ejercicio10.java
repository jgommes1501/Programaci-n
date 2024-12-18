package tema3;

import java.util.Arrays;

public class ejercicio10 {
    public static void main(String[] args) {
		int[] a = new int[10];
		Arrays.fill(a, 3);
		System.out.println(Arrays.toString(a));
		
		Arrays.fill(a, 5, 9, 2);
		System.out.println(Arrays.toString(a));

	}

}