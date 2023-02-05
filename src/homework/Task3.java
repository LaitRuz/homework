package homework;

/* Даны два прямоугольных треугольника.
        Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
        Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.

        Для этого понадобится написать 2 функции.
        Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
        Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
        Учитывать, что площадь может быть вещественным числом. */

public class Task3 {
    public static void main(String[] args) {
        int sideA = 5;
        int sideB = 6;
        double square2 = 8.5;
        double square1;
        char result = 0;
        square1 = funSquare(sideA, sideB);
        {
            if (square1 == square2) {
                System.out.println("Площадь трехугольников равна");
            } else if (square1 >= square2) {
                System.out.println("Площадь первого трехугольника больше, чем у второго");
            } else if (square1 <= square2) {
                System.out.println("Площадь первого трехугольника меньше, чем у второго");
            } else {
                System.out.println("Ошибка, повторите ввод");
            }
        }

    }

    // the function of calculating the area of the first triangle.
    public static double funSquare(int sideA, int sideB) {

        double square1;
        {
            square1 = 0.5 * sideA + sideB;
            System.out.println(square1);
        }
        return square1;
    }
}
