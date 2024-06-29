package ejercicio6;

/**
 * Crea un array de enteros con los números {2, 4, 6, 8, 10}. Calcula e imprime el promedio de los elementos del array
 */
public class CalcularPromedio {
    public static void main(String[] args) {
        int [] numbers = {2, 4, 6, 8, 10};
        int count = 0;
        for(int number:numbers){
            count += number;
        }
        System.out.println(count/numbers.length);
    }

}
