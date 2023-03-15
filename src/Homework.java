public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " isn't leap year");
        }
    }
    public static void checkDevice(int currentYear, int currentOS) {
        if (currentOS == 0) {
            if (currentYear <= 2015) {
                System.out.println("Please set up light iOS app version");
            } else {
                System.out.println("Please set up usual iOS app version");
            }
        } else if (currentOS == 1) {
            if (currentYear <= 2015) {
                System.out.println("Please set up light Android app version");
            } else {
                System.out.println("Please set up usual Android app version");
            }
        }
    }
    public static int deliveryDays(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays++;
            System.out.println("Delivery will take: " + deliveryDays + " day");
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Delivery will take: " + deliveryDays + " days");
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 3;
            System.out.println("Delivery will take: " + deliveryDays + " days");
        }
            if (deliveryDistance > 100) {
                System.out.println("There isn't delivery");
            }
            return deliveryDays;
        }
    public static void task1() {

        System.out.println("Task 1");
        int year = 100;
        checkYear(year);
    }
    public static void task2() {
        System.out.println("Task 2");
        int currentYear = 2010;
        int currentOS = 1;
        checkDevice(currentYear, currentOS);
    }
    public static void task3() {
        System.out.println("task 3");
        int deliveryDistance = 70;
        deliveryDays(deliveryDistance);
    }
}