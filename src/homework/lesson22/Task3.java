package homework.lesson22;


/*
Задание 3
Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
300$ в месяц Ваня тратит на еду и развлечения.
10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.

Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты.
 */


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int startZp = 600;
        int upZp = 400;
        int monthEnter = 38;
        int personalAccount = getPersonalAccount(startZp, upZp, monthEnter);
        int BrokerAccount = getBrokerAccount(startZp, upZp, monthEnter);

        System.out.println("personal account: " + personalAccount + "$");
        System.out.println("Broker's account: " + BrokerAccount + "$");

    }

    private static int getBrokerAccount(int startZp, int upZp, int mouthEnter) {
        int broker = 0;
        for (int mounthOne = 1; mounthOne != 6; mounthOne++) {
            broker = (((startZp % 10) %2) + (startZp % 10)) * mounthOne;
        }
        return broker;
    }

    //Вычисление заработка Ивана за 6 месяцев и за (N - месяцев) остатков на счету.
    private static int getPersonalAccount(int startZp, int upZp, int mouthEnter) {
        int personal = 0;
        for (int mounthOne = 1; mounthOne != 6; mounthOne++) {
            personal = (( startZp - (startZp %10) - 300) * mouthEnter) + ((mouthEnter / 6) * upZp );
        }

        return personal;
    }
}
