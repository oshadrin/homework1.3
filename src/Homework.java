
public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int clientOS = 0;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {

        int clientDeviceYear = 2014;
        int clientOS = 0;

        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static void task3() {

        int year = 1768;
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("високосный");
            }
        } else if (year % 400 == 0) {
            System.out.println("високосный");
        } else {
            System.out.println("обычный");
        }
    }

    public static void task4() {

        int deliveryDistance = 95;
        int days = 1;

        if (deliveryDistance > 20) {
            days++;
            System.out.println("срок доставки дней: " + days);
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            days++;
            System.out.println("срок доставки дней: " + days);
        } else {
            System.out.println(" не доставляется");
        }
    }

    public static void task5() {

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("нет такого месяца");
        }
    }

    public static void task6() {
        int age = 19;
        int salary = 58000;
        double limit = 1;
        if (age < 23) {
            limit = salary * 2;
            if (salary >= 50000) {
                limit = (salary * 1.2);
            } else if (salary >= 80000) {
                limit = (salary * 1.5);
            }
        } else if (age >= 23) {
            if (salary >= 50000) {
                limit = salary * 1.2;
            } else if (salary >= 80000) {
                limit = salary * 1.5;
            }

        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
    }

//Базовая ставка для клиента — 10% годовых.
// Срок кредитования — 12 месяцев.
// Максимальный ежемесячный платеж — 50% от ЗП.
// Если возраст меньше 23, то добавляем 1% к ставке.
// Если возраст меньше 30, то добавляем 0.5% к ставке.
// Если зарплата больше 80_000, уменьшаем ставку на 0.7%.

//Вводные данные: используйте переменные
// age = 25 для обозначения возраста,
// salary = 60_000 для обозначения зарплаты,
// wantedSum = 330_000 для обозначения желаемой суммы кредита.

// Если максимальный допустимый платеж по ЗП больше стандартного платежа по кредиту согласно процентной ставке,
// то кредит одобрен, если меньше — отказан.
//Пример ответа в консоль:
// «Максимальный платеж при ЗП *** равен *** рублей. Платеж по кредиту *** рублей. Одобрено/отказано».

    public static void task7() {

    int age = 25;
    double salary = 60000;
    double rate = 0.1;
    int wantedSum = 330_000;
    int time = 12;

        if (age < 23) {
        rate = rate + 0.01;
    } else if (age < 23) {
        rate = rate + 0.005;
    }

        if (salary > 80_000) {
        rate = rate - 0.007;
    }

    double payment = ((wantedSum * rate) + wantedSum) / 12;
    double maxPayment = salary / 2;

        System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж по кредиту " + payment + " рублей. " + strPermission(maxPayment, payment));
}
    public static String strPermission(double maxPayment, double payment) {
        if (maxPayment > payment) {
            return "Одобрено.";
        } else {
            return "Отказано.";
        }
    }

}

