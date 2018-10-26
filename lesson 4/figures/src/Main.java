/**
 * Создать фигуры: Circle, Rectangle, Triangle, у которых будут координаты.
 * Все фигуры должны иметь методы, которые возвращают площадь и периметр (для окружности - длина окружности).
 */

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point(1,1);
        Point point2 = new Point(1,3);
        Point point3 = new Point(3,1);

        Circle circle = new Circle(point1, 3);

        System.out.println("Длина окружности "+circle.circumference()+" Площадь круга "+circle.area());

        Rectangle rectangle = new Rectangle(point1,2,4);

        System.out.println("Периметр прямоугольника "+rectangle.perimeter()+" Площадь прямоугольника "+rectangle.area());

        Triangle triangle = new Triangle(point1, point2, point3);

        System.out.println("Периметр треугольника "+triangle.perimeter()+" Площадь треугольника "+triangle.area());
    }
}
