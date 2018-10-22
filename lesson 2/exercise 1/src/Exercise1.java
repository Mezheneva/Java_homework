/**
 * Задача 1*
 * В три переменные a, b и c явно записаны программистом три целых попарно неравных между собой числа.
 * Создать программу, которая переставит числа в переменных таким образом, чтобы при выводе
 * на экран последовательность a, b и c оказалась строго возрастающей.
 */

import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {

        Random random = new Random();
        int a, b, c;

        a = random.nextInt(20);
        b = random.nextInt(20);
        c = random.nextInt(20);

        System.out.println(a+" "+b+" "+c+"\n");

        if(a == b || a == c || b == c)
        {
            System.out.println("Неверные значения элементов"+"\n");
        }
        else if (a < b && a < c)
        {
            if (b < c)
            {
                System.out.println(a+" "+b+" "+c+"\n");
            }
            else if (c < b)
            {
                System.out.println(a+" "+c+" "+b+"\n");
            }
        }
        else if (b < a && b < c)
        {
            if(a < c)
            {
                System.out.println(b+" "+a+" "+c+"\n");
            }
            else if (c < a)
            {
                System.out.println(b+" "+c+" "+a+"\n");
            }
        }
        else if (c < a && c < b)
        {
            if(a < b)
            {
                System.out.println(c+" "+a+" "+b+"\n");
            }
            else if (b < a)
            {
                System.out.println(c+" "+b+" "+a+"\n");
            }
        }

    }
}
