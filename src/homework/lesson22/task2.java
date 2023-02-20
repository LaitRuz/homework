package homework.lesson22;
import java.util.Scanner;

/*
* Дано целое число.
* Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
* Результат вывести на консоль.
* Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
*
* Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
*
* */

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        // block scanner console
        // enter a number

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int value = scanner.nextInt();
        int valueOut = getReverseInt(value);

        // value output
        System.out.println("Out number: " + valueOut);
    }

    private static int getReverseInt(int value) {
        int valueOut = 0;
        for (int currentValue = value; currentValue != 0; currentValue /= 10) {
            valueOut = valueOut * 10 + currentValue % 10;
        }

        return valueOut;
    }
}
