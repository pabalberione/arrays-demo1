package ejercicio3;

/**
 * Crea un array de enteros con los números {3, 5, 7, 2, 8}. Encuentra e imprime el mayor elemento del array.
 */
public class ImprimirMayor {

    public static void main(String[] args) {
        int []numbers = {3, 5, 7, 2, 8};
        int count = 0;

        for(int number: numbers){
            if(number > count){
                count = number;
            }
        }
        System.out.println(count);
    }

}
