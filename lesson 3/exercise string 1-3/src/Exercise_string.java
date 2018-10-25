/**
 * Строки
 * 1) Найти в строке указанную подстроку и заменить ее на новую.
 * Строку, ее подстроку для замены и новую подстроку вводит пользователь.
 *
 * 2) Требуется удалить из нее повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 *
 * 3) Вводится строка, содержащая буквы, целые неотрицательные числа и иные символы.
 * Требуется все числа, которые встречаются в строке, поместить в отдельный целочисленный массив.
 * Например, если дана строка "дом 48, корпус 9, парадная 7, этаж 4", то в массиве должны оказаться числа 48, 9, 7 и 4
 */

import java.util.Scanner;
import java.util.*;


public class Exercise_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // (1)
        System.out.println("Введите строку");
        String str = scanner.nextLine();

        System.out.println("Ведите удаляемую подстроку");
        String strSub = scanner.nextLine();

        System.out.println("Введите новую подстроку");
        String strSubN = scanner.nextLine();

        String strN = str.replaceAll(strSub, strSubN);
        System.out.println("Новая строка:"+strN );

        scanner.close();

        // (2)
        String str1 = "при    вввве ттт";

        String str2 = str1.replaceAll("\\s", "");

        System.out.println("\n"+"Строка без пробелов:"+str2);

        StringBuffer sb = new StringBuffer(str2);
        for (int i = 0; i < sb.length(); i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                if (sb.charAt(i) == sb.charAt(j)) {
                    sb.deleteCharAt(j);
                    j--;
                }
            }
        }
        System.out.println("\n"+"Строка без повторяющихся символов:"+ sb.toString());

        // (3)

        String str3 = "дом 48, корпус 9, парадная 7, этаж 4";
        String[] strArr = (str3.replaceAll("\\D+", " ")
                .trim()).split(" ");
        System.out.println("\n" + Arrays.toString(strArr));

    }
}
