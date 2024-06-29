package ejercicio7;

/**
 * Crea un array de enteros con los números del 1 al 5. Crea un segundo array y copia los elementos del primer array
 * al segundo array. Imprime los elementos del segundo array.
 */
public class CopiarArray {

    public static void main(String[] args) {
        int[]numbers = {1, 2, 3, 4, 5};
        int[]numbersBis = new int[5];

        for(int i = 0; i < numbers.length; i++){
            numbersBis[i] = numbers[i];
        }

        for(int i = 0; i < numbersBis.length; i++){
            System.out.println(numbersBis[i]);
        }
    }



}
