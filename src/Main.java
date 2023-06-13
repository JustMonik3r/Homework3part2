// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            System.out.println();
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
            System.out.println();
        }

        //Задача 2
        int clientOS2 = 1;
        int clientDeviceYear = 2015;
        int stableDeviceYear = 2015;
        if (clientOS2 == 0) {
            if (clientDeviceYear < stableDeviceYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                System.out.println();
            } else {
                System.out.println("Установите стабильную версию приложения для iOS по ссылке");
                System.out.println();
            }
        } else if (clientOS2 == 1){
            if (clientDeviceYear < stableDeviceYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
                System.out.println();
            } else {
                System.out.println("Установите стабильную версию приложения для Android по ссылке");
                System.out.println();
            }
        }

        //Задача 3
        int year = 2023;
        if (((year % 4 == 0) && (year % 100 !=0)) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
            System.out.println();
        } else {
            System.out.println(year + " год не является високосным");
            System.out.println();
        }

        //Задача 4
        int deliveryDistance = 1;
        int deliveryTime;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println("На доставку потребуется дней: " + deliveryTime);
            System.out.println();
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("На доставку потребуется дней: " + deliveryTime);
            System.out.println();
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("На доставку потребуется дней: " + deliveryTime);
            System.out.println();
        }
        if (deliveryDistance > 100) {
            System.out.println("На данное расстояние доставки нет");
            System.out.println();
        }

        //Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Это зимний месяц");
                System.out.println();
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц");
                System.out.println();
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц");
                System.out.println();
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Это осенний месяц");
                System.out.println();
                break;

            default:
                System.out.println("Номер месяца указан неверно");
                System.out.println();
        }

    }
}