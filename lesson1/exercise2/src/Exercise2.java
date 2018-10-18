/** Задание 2
 * На садовом участке площадью 10 соток, разбили грядки 15 на 25 метров.
 * Сколько м2 осталось незанято?
 */

public class Exercise2 {
    public static void main(String[] args) {

        int areaOfPlot, areaOfBeds, freeArea;

        areaOfPlot = 100 * 10;
        areaOfBeds = 15 * 25;

        freeArea = areaOfPlot - areaOfBeds;

        System.out.println(freeArea);
    }
}
