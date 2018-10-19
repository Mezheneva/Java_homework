/**
 * Задача 6:
 * В три переменные a, b и c записаны три вещественных числа.
 * Создать программу, которая будет находить и выводить на экран вещественные
 * корни квадратного уравнения ax²+bx+c=0,либо сообщать, что корней нет.
 */

import java.util.Random;

public class Exersice6 {
    public static void main(String[] args) {

        Random random = new Random();

        double a, b, c;
        double D;
        double x1, x2;
        boolean flag;

        a = 15 * random.nextDouble();
        b = 15 * random.nextDouble();
        c = 15 * random.nextDouble();

        System.out.println("Решаемое уравнение: "+a+" x^2 + "+b+" x + "+c+" = 0" + "\n");

        D = b * b - 4 * a * c;

        if (D > 0) {
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            x1 = -b / (2 * a);
            System.out.println("x = " + x1);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней");
        }
    }
}
