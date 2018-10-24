/**
 * Задача 7*
 * Электронные часы показывают время в формате от 00:00 до 23:59.
 * Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается
 * симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
 */

public class Exercise7 {
    public static void main(String[] args) {
        int hour = 0;
        int minute = 0;
        int count = 0;

        do {
            if(((hour/10) == (minute%10)) && ((hour%10) == (minute/10))) {
                count++;
            }

            if(minute == 59) {
                hour++;
                minute = 0;
            }
            else{
                minute++;
            }

        }while (hour != 24 || minute != 0);

        System.out.println(count);

    }
}
