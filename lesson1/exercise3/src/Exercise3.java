/** Задание 3
 * Найдите площадь овального кольца, полученного из овала площадью 15 дм2 вырезанием овала площадью 600 см2.
 */

public class Exercise3 {
    public static void main(String[] args) {

        int ovalArea, cutArea, ringArea;

        ovalArea = 15 * 100;
        cutArea = 600;

        ringArea = ovalArea - cutArea;

        System.out.println(ringArea);
    }
}
