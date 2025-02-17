public class Main {
    public static void main(String[] args) {
//№1
        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
//№2
        int clientDeviceYear = 2014;
        int clientOS2 = 1;
        if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию Android по ссылке");
        } else if (clientOS2 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию Android по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию IOS по ссылке");
        } else if (clientOS2 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию IOS по ссылке");
        }
//№3
        int year = 2025;
        if (year >= 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }

//№4
        int deliveryDistance = 63;
        int deliveryTime = 1;
        int deliveryTime2 = 2;
        if (deliveryDistance > 100) {
            System.out.println("нет доставки");
        } else if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 60) {
            deliveryTime++;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 100) {
            deliveryTime2++;
            System.out.println("Потребуется дней: " + deliveryTime2);
        }
//№5
        int monthNumber = 9;
        switch (monthNumber) {
            case 1:
                System.out.println("Первый месяц, январь, принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Второй месяц, февраль, принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Третий месяц, март, принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Четвёртый месяц, апрель, принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Пятый месяц, май, принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Шестой месяц, июнь, принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Седьмой месяц, июль, принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Восьмой месяц, август, принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Девятый месяц, сентябрь, принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Десятый месяц,октябрь,принадлежит к сезону осень");
            case 11:
                System.out.println("Одиннадцатый месяц, ноябрь, принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Двенадцатый месяц, декабрь, принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }


}