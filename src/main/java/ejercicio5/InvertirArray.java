package ejercicio5;

/**
 * Crea un array de enteros con los números del 1 al 10. Invierte el array e imprime los elementos en orden inverso.
 */
public class InvertirArray {
    public static void main(String[] args) {
        int [] array = {4,6,2,8,7};

        for (int i = 0; i < array.length/2; i++) {
            int j = array.length-i-1;
            int a = array[i];
            array[i] = array[j];
            array[j] = a;
        }
    }
}
