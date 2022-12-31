public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        byte clientOS = 0;
        short yearOfIssue = 2013;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (yearOfIssue < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (yearOfIssue < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int year = 2500;
        if ( year%4 == 0 && year%100 != 0) {
            System.out.println(year + " год является високосным");
            }
        else if ( year%400 == 0 ) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int daysOfDelivery = 1;
        if ( deliveryDistance < 20 ) {
            System.out.println("Потребуется дней: " + daysOfDelivery);
        }
        daysOfDelivery = daysOfDelivery + 1;
        if ( deliveryDistance >= 20 && deliveryDistance < 60 ) {
            System.out.println("Потребуется дней: " + daysOfDelivery);
        }
        daysOfDelivery = daysOfDelivery + 1;
        if ( deliveryDistance >= 60 && deliveryDistance < 100 ) {
            System.out.println("Потребуется дней: " + daysOfDelivery);
        }
        if ( deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Это зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
}