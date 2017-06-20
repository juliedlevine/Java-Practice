package com.juliemdyer;
import java.util.Scanner;

// COINS EXERCISE
public class Main {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int coinCount = 0;
        String answer = "";

        do {
            System.out.printf("You have %s coins. Do you want another?  ", coinCount);
            answer = user_input.next().toLowerCase();
            coinCount++;
        } while (answer.equals("yes"));


    }
}


// TIP CALCULATOR EXERCISE
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner user_input = new Scanner(System.in);
//
//        System.out.println("Enter your bill amount:  ");
//        int bill = Integer.parseInt(user_input.next());
//
//        System.out.println("Enter your level of service (good / fair / poor):  ");
//        String service = user_input.next();
//
//        System.out.println("Split how many ways?  ");
//        int split = Integer.parseInt(user_input.next());
//
//        double newTotal = 0;
//        if (service.equals("good")) {
//            newTotal = (bill * 0.2) + bill;
//        } else if (service.equals("fair")) {
//            newTotal = (bill * 0.15) + bill;
//        } else if (service.equals("poor")) {
//            newTotal = (bill * 0.1) + bill;
//        }
//
//        double totalForEach = newTotal / split;
//
//        System.out.printf("The total bill for the table is: $%.2f. Each person owes: $%.2f.%n", newTotal, totalForEach);
//
//    }
//}


// DAYS OF THE WEEK EXERCISE
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner user_input = new Scanner(System.in);
//        System.out.println("Day (0 - 6)?  ");
//
//        try {
//            int day = Integer.parseInt(user_input.next());
//            if (day < 0 || day > 6) {
//                System.out.println("That's not a valid day.");
//            } else if (day == 0) {
//                System.out.println("Sunday");
//            } else if (day == 1) {
//                System.out.println("Monday");
//            } else if (day == 2) {
//                System.out.println("Tuesday");
//            } else if (day == 3) {
//                System.out.println("Wednesday");
//            } else if (day == 4) {
//                System.out.println("Thursday");
//            } else if (day == 5) {
//                System.out.println("Friday");
//            } else if (day == 6) {
//                System.out.println("Saturday");
//            }
//        } catch (NumberFormatException e) {
//            System.out.println("That's not a number.");
//        }
//
//    }
//}
