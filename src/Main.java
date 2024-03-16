public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOs = 0;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 0) {
            System.out.println("становите версию приложения для iOS по ссылке");
        }

        //Задача 2
        clientOs = 1;
        int clientDeviceYear = 2015;
        if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченую версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченую версию приложения для Ios по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("становите версию приложения для iOS по ссылке");
        }
        //задача 3
        int year = 2021;
        if (year >= 1584 && year % 400 == 0 || year >= 1584 && year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");

        // задача 4
        int days = 0;
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            days = days + 1;
            System.out.println("Доставка займет " + days + " день");
        } else if (deliveryDistance < 60) {
            days = days + 2;
            System.out.println("Доставка займет " + days + " дня");
        } else if (deliveryDistance < 100) {
            days = days + 3;
            System.out.println("Доставка займет " + days + " дня");
        } else System.out.println("Доставка не осуществляется");
        //Задача 5
        int month = 1;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Ошибка");
                //со свичом очень просто(понравлось)
        }
    }
}