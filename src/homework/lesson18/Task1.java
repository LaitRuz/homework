package homework.lesson18;

/*
*  В переменной minutes лежит число от 0 до 59.
* Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
* в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
* Протестировать функцию в main.
* */

public class Task1 {
    public static void main(String[] args) {
        int minutes = 48;
        if (0 <= minutes && minutes <= 15) {
            System.out.println("Первая четверть " + minutes);
        } else if (16 <= minutes && minutes <= 30) {
            System.out.println("Вторая четверть " + minutes);
        } else if (31 <= minutes && minutes <= 45) {
            System.out.println("Третья четверь " + minutes);
        } else if (46 <= minutes && minutes <= 59) {
            System.out.println("Четвертая четверь " + minutes);
        } else {
            System.out.println("В часе 60 минут, неправильное значение " + minutes);
        }
    }
}
