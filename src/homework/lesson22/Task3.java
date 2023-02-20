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


public class Task3 {
    public static void main(String[] args) {
        double startZp = 600;
        double upZp = 400;
        int monthEnter = 38;
        double personalAccount = getPersonalAccount(startZp, upZp, monthEnter);
        double BrokerAccount = getBrokerAccount(startZp, upZp, monthEnter);
        // вывод информации в концоль
        System.out.println("personal account: " + personalAccount + "$");
        System.out.println("Broker's account: " + BrokerAccount + "$");

    }

    // Расчет брокерского счета с процентной ставкой

    private static double getBrokerAccount(double startZp, double upZp, int monthEnter) {
        double broker = 0;
        for (int mouthOne = 1; mouthOne < monthEnter; mouthOne++) {
            broker = broker + (0.1 * startZp) + 0.02 * broker;
            if (mouthOne % 6 == 0) {
                startZp = startZp + upZp;
            }
        }
        return broker;
    }

    // Расчет персонального счета за N - месяцев.

    private static double getPersonalAccount(double startZp, double upZp, int mouthEnter) {
        double personal = 0;
        for (int mounthOne = 1; mounthOne < mouthEnter; mounthOne++) {
            personal = personal + (startZp - (0.1 * startZp) - 300);
            if (mounthOne % 6 == 0) {
                personal = personal + upZp;
            }
        }
        return personal;
    }
}