package ejercicio4;

/**
 * Crea un array de enteros con los números del 1 al 20. Cuenta e imprime cuántos elementos del array son pares.
 */
public class ContarPares {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int count = 0;
        for(int number: numbers){
            if(number%2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
