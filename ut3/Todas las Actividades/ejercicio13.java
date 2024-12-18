package tema3;

public class ejercicio13 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {3, 2, 1};

        System.out.println(compararArrays(array1, array2)); // true
        System.out.println(compararArrays(array1, array3)); // false
    }

    public static boolean compararArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        
        return true;
    }
}

