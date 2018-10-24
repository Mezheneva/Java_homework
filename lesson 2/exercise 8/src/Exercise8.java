/**
 * Задача 8*
 * Есть три вершины X, Y, Z.
 * Их координаты (x1, x2), (y1, y2), (z1, z2) заданы как целые числа.
 * Нужно определить - является ли треугольник с заданными координатами прямоугольным.
 */

public class Exercise8 {
    public static void main(String[] args) {
        int x1, x2, y1, y2, z1, z2;
        int xy, xz, zy;
        int max;

        x1 = 0; x2 = 0;
        y1 = 0; y2 = 3;
        z1 = 5; z2 = 0;


        xy =  (int)(Math.pow((y1 - x1), 2) + Math.pow((y2 - x2), 2));
        xz =  (int) (Math.pow((z1 - x1), 2) +  Math.pow((z2 - x2), 2));
        zy =  (int) (Math.pow((z1 - y1), 2) +  Math.pow((z2 - y2), 2));

        max = Math.max(xy, Math.max(xz,zy));

        if(max == xy) {
            if(max == xz+zy) {
                System.out.println("Треугольник прямоугольный");
            }
            else{
                System.out.println("Треугольник не прямоугольный");
            }
        }
        else if(max == xz) {
            if(max == xy+zy) {
                System.out.println("Треугольник прямоугольный");
            }
            else{
                System.out.println("Треугольник не прямоугольный");
            }
        }
        else {
            if(max == xy+xz) {
                System.out.println("Треугольник прямоугольный");
            }
            else{
                System.out.println("Треугольник не прямоугольный");
            }
        }

    }
}
