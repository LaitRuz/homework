package homework;

/*
 * Даны 3 переменные:
 *
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 *
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 *
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 *
 * */


public class Task2 {
    public static void main(String[] args) {
        double operand1 = 24.4;
        double operand2 = 10.1;
        char operation = '+';
        double result;
        result = funOperation1(operand1, operand2, operation); {
            System.out.println( "Выбрана операция: " + result);
        }
    }
    /*
     * operation char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’
     */

    public static double funOperation1(double value1,
                                       double value2,
                                       char operation) {
        double result = 0;
        if (operation == '*') {
            result = value1 * value2;
        } else if (operation == '+') {
            result = value1 / value2;
        } else if (operation == '/') {
            result = value1 / value2;
        } else if (operation == '%') {
            result = value1 % value2;
        } else {
            System.out.println("Ошибка ввода операции " + result);
        }
        return result;
    }

}
