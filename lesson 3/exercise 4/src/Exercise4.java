/**
 * Задача 4*
 * Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив
 * указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку.
 * После этого программа должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше:
 * левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число,
 * то программа должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {

        int [] arr;

        Random random = new Random();
        int max = 5, min = -5;

        boolean scan = false;
        int num;

        int sum1 = 0, sum2 = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите четное положительное число ");
            num = scanner.nextInt();
            if ((num < 0) || (num%2 != 0)) {
                System.out.println("Неверный ввод.");
            } else {
                scan = true;
            }
        }while (scan != true);

        arr = new int [num];
        for (int i = 0; i < arr.length; i++){
            arr[i] = min + random.nextInt(max - min);
        }

        System.out.println(Arrays.toString(arr)+ "\n");

        for (int i = 0; i < (arr.length/2); i++) {
            sum1 += Math.abs(arr[i]);
            sum2 += Math.abs(arr[i+(arr.length/2)]);
        }

        if (sum1 > sum2) {
            System.out.println("Сумма модулей левой половины больше");
        }
        else if (sum2 > sum1){
            System.out.println("Сумма модулей правой половины больше");
        }
        else {
            System.out.println("Суммы равны");
        }

    }
}
