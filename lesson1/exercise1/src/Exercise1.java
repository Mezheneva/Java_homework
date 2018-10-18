/** Задача 1
 * Задайте высоту, длину и ширину прямоугольного параллелепипеда и найти его площадь.
 * Узнайте, что больше: ширина или высота и выведите информацию об этом в консоль.
 */

import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {

        Random random = new Random();
        int height, length, width, area;

        height = random.nextInt(10);
        length = random.nextInt(10);
        width  = random.nextInt(10);

        area = 2 * (height * length + length * width + height * width);

        System.out.println( "height = "+height+" length = "+length+" width = "+width
                +"\n"+"area = "+area+"\n" );

        String comparisonResult = (height >= width) ?
                ( (height == width) ? ("Width and height are equal") : ("Height is greater than width") ) :
                ("Width is greater than height");

        System.out.println(comparisonResult);
    }
}
