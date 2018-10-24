/**
 * Задача 2
 * Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
 * а затем этот же массив выведите на экран тоже в строку,
 * но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;


public class Exercise2 {
    public static void main(String[] args) {

        int [] arr = new int[50];

        for ( int i = 0, j = 0; i <= 99; i++){
            if( i%2 != 0){
                arr[j] = i;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr)+ "\n");

        ArrayUtils.reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}
