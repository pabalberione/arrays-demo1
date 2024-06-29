package ejercicio2;

/**
 * Crea un array de enteros con los números del 1 al 10. Calcula e imprime la suma de todos los elementos del array.
 */
public class SumarElementos {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for(int number:numbers){
            count += number;
        }
        System.out.println(count);
    }

}
