package Ejercicio9;

/**
 * Crea un array de enteros con los números {1, 3, 5, 7, 9}. Busca el número 5 en el array e imprime su
 * posición (índice).
 */
public class BuscarElemento {
    public static void main(String[] args) {
        int [] numbers = {1, 3, 5, 7, 9};
        int pos = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]==5){
                pos = i;
            }
        }
        System.out.println(pos);
    }
}
