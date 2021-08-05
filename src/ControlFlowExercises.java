//import java.util.Scanner;
//
//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println( i + " ");
//            i++;
//        }
//
//        int i = 2;
//        do {
//            System.out.println("i");
//        } while (i <= 100);
//
//        int i = 100;
//        do {
//            System.out.println(i);
//            i = i - 5;
//        }
//        while (i >= -10);
//
//
//        long i = 2;
//        do {
//            System.out.println(i);
//            i = (long) Math.pow(i, 2);
//        }
//        while (i <= 1000000);
//
//        for(int i = 0; i <= 15 ; i ++) {
//            System.out.println(i);
//        }
//        for (int i = 0; i<= 100 ; i+= 2) {
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= 0 ; i-= 5) {
//            System.out.println(i);
//        }
//
//        for (long i = 2; i < 1000000 ; i= (long) Math.pow(i,2)) {
//            System.out.println(i);
//        }
//
//
//        2.
//        for(int i = 1; i <= 100; i++) {
//            if(i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
//
//
//        3.
//        Scanner scanner = new Scanner(System.in);
//
//        boolean userContinues = true;
//
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInt = scanner.nextInt();
//            System.out.println("\nHere is your table!\n");
//            System.out.println("number | squared| cubed");
//            System.out.println("-------|--------|-------");
//            for (int i = 1; i <= userInt; i++) {
//                System.out.printf("%-6d", i);
//                System.out.print(" | ");
//                System.out.printf("%-7d", i * i);
//                System.out.print(" | ");
//                System.out.print(i * i * i);
//                System.out.println();
//            }
//            System.out.println("Would you like to enter another number (y/n)?");
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                userContinues = false;
//            }
//        }while(userContinues);
//
//
//        4.
//        boolean anotherGrade = true;
//
//        do {
//            System.out.println("Please enter a numerical grade from 0 -100");
//
//            int userGrade = scanner.nextInt();
//
//
//            if (userGrade >= 88) {
//                System.out.println("A");
//            } else if (userGrade >= 80) {
//                System.out.println("B");
//            } else if (userGrade >= 67) {
//                System.out.println("C");
//            } else if (userGrade >= 60) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//        System.out.println("Do you want to enter a new grade? (y/n?");
//
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                anotherGrade = false;
//            }
//        } while (anotherGrade);
//
//
//
//
//

//    }
//}
