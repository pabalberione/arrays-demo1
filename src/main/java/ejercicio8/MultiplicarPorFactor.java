package ejercicio8;

/**
 * Crea un array de enteros con los números del 1 al 5. Multiplica cada elemento del array por 2 e imprime el
 * array resultante.
 */
public class MultiplicarPorFactor {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};

        for(int number: numbers){
            int count = 0;
            count = number * 2;
            System.out.println(count);
        }
    }
}
