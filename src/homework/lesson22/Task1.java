package homework.lesson22;
import java.util.Scanner;
/*

Задание 1
Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).

*/



public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввведите число: ");
        int value = scanner.nextInt();
 //       int value = 228910;
        int resultEvent = resultEventNumber(value);
        int resultOdd = resultOddNumber(value);
        System.out.println("Количество четных чисел: " + resultEvent );
        System.out.println("Количество нечетных чисел: " + resultOdd);
    }

    //Производим вычисление чисел, которые нечетные, 1, 3, 5, 7, 9.
    private static int resultOddNumber(int value2) {
        int resultOdd = 0;
        for (int currentValue2 = (value2 > 0 ? value2 : value2 * -1); currentValue2 != 0; currentValue2 = currentValue2 / 10) {
            if (currentValue2 % 2 == 1) {
                resultOdd++;
            }
        }
        return resultOdd;
    }

    // Производим вычисление чисел которые четные 0, 2, 4, 6, 8.
    private static int resultEventNumber(int value1) {
        int resultEvent = 0;
        for (int currentValue = (value1 > 0 ? value1 : value1 * -1); currentValue != 0; currentValue = currentValue / 10) {
            if (currentValue % 2 == 0) {
                resultEvent++;
            }
        }
        return resultEvent;
    }
}