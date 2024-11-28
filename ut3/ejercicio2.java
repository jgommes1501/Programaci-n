package programación.ut3;

public class ejercicio2 {
	public static void main (String []arg) { 
		
	int a[], b[] = null, c[], d[], e[];

		a = new int[5];
		a[0] = 10;
		System.out.println(a);
		System.out.println(a[0]);
		a[1] = 11;
		System.out.println(b);
		b = a;
		System.out.println(b);
		a = null;
		System.out.println(a);
		b= null;
		System.out.println("Fin");
	
}
}
