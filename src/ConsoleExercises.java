import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.println("The value of pi is approximately " + String.format("%.2f", pi));


//        Scanner scanner = new Scanner(System.in); //Allows scanner to work w/ input
//        System.out.println("Enter integer"); // request input
//        int userInput = scanner.nextInt(); // stored input can be float
//        System.out.println(userInput); // Here's the output

//        String Vatos = "Vatos";
//        String locos = "Locos";
//        String forever = "Forever";
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter something: ");
//        Vatos = scanner.next();
//        locos = scanner.next();
//        forever = scanner.next();
//        System.out.println("You entered:  --> \"" + Vatos + locos + forever + "\" <--");

//        String Sentence = "ali";
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a sentence: ");
//        Sentence = scanner.nextLine();
//        System.out.println("You entered: ---> \"" + Sentence + "\" <--");

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter the length  of the Codeup Classroom:");
        String userInput = scanner.nextLine();
        double UserNumbers = Integer.parseInt(userInput);
        System.out.println("You entered Length: -->\" " +UserNumbers + "\" <--");


        System.out.println("Enter the Width of the Classroom");
        String UserInputWidth = scanner.nextLine();
        double  UserWidth = Integer.parseInt(UserInputWidth);
        System.out.println("You entered Width: -->\" " +UserInputWidth + "\" <--");


        double area = UserNumbers * UserWidth;
        double perimiter = area * 2;
        System.out.printf("The area of the classroom is %s \n",area );
        System.out.printf("The perimeter of the classroom is %s \n",perimiter);


//        System.out.println("You entered Width) \" " +area+ "\" \""+perimiter+"\"");
        System.out.println("What is the height of the Codeup Classroom?:");
        String userInputHeight = scanner.nextLine();
        double UserHeight = Integer.parseInt(userInputHeight);
        System.out.println("You entered Height: -->\" " +userInputHeight + "\" <--");
        double volume = UserNumbers * UserWidth * UserHeight;
        System.out.printf("The volume of the Codeup Classroom is: %s \n",volume);
    }
}



