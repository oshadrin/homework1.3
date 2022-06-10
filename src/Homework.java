public class Homework {
    public static void main(String[] args) {

        //exercise1

        int clientOS = 0;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //exercise2

        int clientDeviceYear = 2014;
        //clientOS объявлена в задаче 1

        if (clientDeviceYear < 2015 && clientOS == 0){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        //exercise 3

        int year = 1768;
            if (year % 4 == 0){
                if(year % 100 != 0) {
                    System.out.println("високосный");
                }
            } else if (year % 400 == 0) {
                System.out.println("високосный");
            } else {
                System.out.println("обычный");
            }

        //exercise 4

        int deliveryDistance = 95;
        int days = 1;

            if (deliveryDistance > 20) {
                days++;
                System.out.println("срок доставки дней: " + days);
            }else if (deliveryDistance > 60 && deliveryDistance < 100) {
                days++;
                System.out.println("срок доставки дней: " + days);
            } else {
                System.out.println(" не доставляется");
            }

        //exercise 5

        int monthNumber = 12;
            switch(monthNumber) {
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
}
