package util;

import java.util.Scanner;

public class Input {

    private Scanner keyboardInput; //Scanner field


    public Input() {  // Constructor.
        keyboardInput = new Scanner(System.in);
    }


//   public String getString() {
//        System.out.println("I feel good");
//        String userString = keyboardInput.nextLine();
//        return userString;
//    }
//
//    public String getString() {
////        System.out.println("Type Something: ");
//        String userString = keyboardInput.nextLine();
//        return userString;
//    }
//
//    public boolean yesNo() {
////        System.out.println("Select (y/n): ");
//        String userAnswer = keyboardInput.nextLine();
//        return userAnswer.equals("y");
//    }
//
//    public int getInt() {
//        System.out.println("Give me an Integer: ");
//        int userInt = keyboardInput.nextInt();
//        return userInt;
//    }
//
//    public int getInt(int min, int max) {
//        System.out.println("Enter an integer: ");
//        int userInt = keyboardInput.nextInt();
//
//        if (userInt < min || userInt > max) {
//            System.out.println("Try again!");
//            return getInt(min, max);
//        } else {
//            System.out.println("That's a valid integer");
//            return userInt;
//        }
//    }
//
//
//
//    public double getDouble(double min, double max) {
//        System.out.println("Type in a decimal: ");
//        double userDouble = keyboardInput.nextDouble();
//
//        if (userDouble < min || userDouble > max) {
//            System.out.println("Try again!");
//            return getDouble(min, max);
//        } else {
//            System.out.println("That's a valid decimal");
//            return userDouble;
//        }
//    }
//
//    public double getDouble() {
//        return 5;
//    }
//
//    public static void main(String[] args) {
//        Input input =  new Input();
//
//
//    }
//
//
//} /*

public String getString() {
        String userString = keyboardInput.nextLine();
        return userString;
    }

    public boolean yesNo() {
        String userAnswer = keyboardInput.next();
        return userAnswer.equals("y");
    }

    public int getInt(int min, int max) {
        System.out.println("Give me an integer: ");
        int userInt;

        try {
            userInt = Integer.valueOf(keyboardInput.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("pendejo get it right");
            return getInt(min, max);
        }
        if (userInt < min || userInt > max) {
            System.out.println("Out of range Try again!");
            return getInt(min, max);
        } else {
//            System.out.println("That's a valid integer.");
            return userInt;
        }
    }

    public int getInt() {
        System.out.print("Give me an integer: ");
        int userInt = 0;
        try {
//              int userInt = scanner.nextInt();
          userInt =  Integer.valueOf(keyboardInput.nextLine());
        } catch (NumberFormatException e) {

        }


        return userInt;
    }


    public double getDouble(double min, double max) {
        double userDouble;
        System.out.println("Give me a decimal: ");
//        double userDouble = scanner.nextDouble();
        try {
            userDouble = Double.valueOf(keyboardInput.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ding dong get it right");
            return getDouble(min, max);
        }
        if (userDouble < min || userDouble > max) {
            System.out.println("Try again!");
            return getDouble(min, max);
        } else {
            System.out.println("That's a valid decimal.");
            return userDouble;
        }
    }

    public double getDouble() {
        System.out.println("Give me a decimal: ");

        try {
            return Double.valueOf(keyboardInput.nextLine());

        } catch (NumberFormatException e) {
            return getDouble();
        }
    }

    public int getBinary() {
        System.out.println("Enter a binary number: ");
        try {
            return Integer.valueOf(keyboardInput.nextLine(), 2);

        } catch (NumberFormatException e) {
            System.out.println("That is not a binary number!");
            return getBinary();
        }
    }

    public int getHex() {
        System.out.println("Enter hex:");
        try {
            return Integer.valueOf(keyboardInput.nextLine(), 16);
        } catch (NumberFormatException e) {
            System.out.println("That is not double!");
            return getHex();
        }
    }


}

