/**
 * Задача 9*
 * Задать количество тарелок и количество моющего средства.
 * Моющее средство расходуется из расчета 0,5 на одну тарелку.
 * В цикле выводить сколько моющего средства осталось после мытья каждой тарелки
 * В конце вывести, сколько тарелок осталось, когда моющее средство закончилось или наоборот.
 */

import java.util.Random;

public class Exercise9 {
    public static void main(String[] args) {

        Random random = new Random();

        double detergent;
        int plate;

        int max = 10;

        plate = random.nextInt(40);
        detergent = max - random.nextDouble();

        System.out.println("тарелки "+plate+" моющее средство "+detergent+"\n");

        while ((detergent > 0) && (plate > 0)){
            plate--;
            detergent -= 0.5;

        }
        if(detergent < 0) {
            System.out.println("Тарелок осталось "+plate);
        }else{
            System.out.println("Моющего средства осталось "+detergent);
        }
    }
}
