public class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static boolean checkYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
    public static void printMessage(int year) {
        if (checkYear(year)) {
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
    public static int checkDays(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance <= 20) {
            deliveryDays++;
        } else if (deliveryDistance < 60) {
            deliveryDays += 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays += 3;
        } else {
            deliveryDays = -1;
        }
            return deliveryDays;
        }
    public static int message(int deliveryDays) {
        if (deliveryDays >= 0) {
            System.out.println("Delivery will take: " + deliveryDays + " days");
        } else {
            System.out.println("There isn't delivery");
        }
        return deliveryDays;
    }

        public static void task1() {
        System.out.println("Task 1");
        int year = 400;
        printMessage(year);
    }
    public static void task2() {
        System.out.println("Task 2");
        int currentYear = 2010;
        int currentOS = 1;
        checkDevice(currentYear, currentOS);
    }
    public static void task3() {
        System.out.println("task 3");
        int deliveryDistance = 10;
        message(checkDays(deliveryDistance));
    }
}