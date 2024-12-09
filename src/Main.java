import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        checkIsYearLeap(1921);
        checkIsYearLeap(1920);
        System.out.println("Задача 2");
        defineAppVersion(1, 2019);
        defineAppVersion(0, 2024);
        defineAppVersion(2, 2021);
        System.out.println("Задача 3");
        System.out.println("Количество дней доставки: " + findDeliveryDays(92));
        System.out.println("Количество дней доставки: " + findDeliveryDays(-10));
    }
    public static void checkIsYearLeap (int year) {
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void defineAppVersion (int deviceOs, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (deviceOs == 0 && deviceYear != currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (deviceOs == 0 && deviceYear == currentYear) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (deviceOs == 1 && deviceYear != currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (deviceOs == 1 && deviceYear == currentYear) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Операционная система не поддерживается");
        }
    }
    public static int findDeliveryDays (int deliveryDistance) {
        int deliveryDays;
        if (deliveryDistance <= 20 && deliveryDistance > 0) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }
}