/** Задание 4
 * Вывести в консоль ближайшее к 10 из двух чисел, записанных в переменные m и n.
 * Например, среди чисел 8.5 и 11.45 ближайшее к десяти 11.45.
 */

import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {

        Random random = new Random();
        double firstNumber, secondNumber, NumberToCompare, outputNumber;

        NumberToCompare = 10;
        firstNumber = 15 * random.nextDouble();
        secondNumber = 15 * random.nextDouble();
        System.out.println();

        System.out.println("first number ="+firstNumber+", second number ="+secondNumber+"\n");

        outputNumber = (Math.abs(NumberToCompare - firstNumber)< Math.abs(NumberToCompare - secondNumber)) ?
                (firstNumber) : (secondNumber);

        System.out.println("The nearest number is "+outputNumber);

    }
}
