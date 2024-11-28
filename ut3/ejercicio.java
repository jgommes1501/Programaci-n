package programación.ut3;

public class ejercicio {
    public static void main(String[] args) {
        
        int naturales[] = {1, 2, 3, 4, 5};
        //int naturales[] = {1,2,3,4,5};
        //Inicializar el array con el numero 1
        
        for (int i = 0; i < naturales.length; i++) {
            naturales[i] = 1;
        
        
        
        
        for (int x : naturales) {
            System.out.println(x);
        }
        int suma = 0;
        for (int i = 0; i < naturales.length; i++) { 
            suma += naturales[i];  
        }

        System.out.println("La suma de los números " + suma);
    }
}
}
