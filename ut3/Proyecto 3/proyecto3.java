package programación.ut3;

import java.util.Scanner;

import java.util.Arrays; 

public class proyecto3 {
	
	
	public static boolean a (String pa1 , String pa2) {
		
		if (pa1.length() != pa2.length()) {
		
		return false;
				
	}
	
	char[] arr1 = pa1.toCharArray();
	char[] arr2 = pa2.toCharArray();
	
	Arrays.sort(arr1);
    Arrays.sort(arr2);

	return Arrays.equals(arr1, arr2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Primera palabra: ");
	String pa1 =sc.nextLine();
	
	System.out.println("Segunda palabra: ");
	String pa2 =sc.nextLine();
	
	if (a(pa1,pa2)) {
		System.out.println("son anagramas"); }
		
		else {
			System.out.println("no son anagramas");
		}
	}

	}


