package ejercicio10;

/**
 * Crea dos arrays de enteros: el primero con los números {1, 2, 3} y el segundo con los números {4, 5, 6}.
 * Fusiona ambos arrays en un nuevo array e imprime los elementos del nuevo array.
 */

public class FusionarArrays {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3};
        int [] numbers2 = {4, 5, 6};

        int [] mergedArray = new int [numbers.length + numbers2.length];
        System.out.println(mergedArray.length);

        for(int i = 0; i < numbers.length; i++){
            mergedArray[i] = numbers[i];
        }

        for(int i = 0; i < numbers2.length; i++){
            mergedArray[numbers.length + i] = numbers2[i];
        }

        for(int i = 0; i < mergedArray.length; i++){
            System.out.println(mergedArray[i]);
        }
    }
}
