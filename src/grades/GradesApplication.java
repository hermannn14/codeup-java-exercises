package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static Input input = new Input();

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student bob = new Student("Bob");
        bob.addGrade(78);
        bob.addGrade(88);
        bob.addGrade(98);

        Student jean = new Student("Jean");
        jean.addGrade(99);
        jean.addGrade(93);
        jean.addGrade(100);

        Student jacques = new Student("Jacques");
        jacques.addGrade(100);
        jacques.addGrade(95);
        jacques.addGrade(100);

        Student alain = new Student("Alain");
        alain.addGrade(95);
        alain.addGrade(87);
        alain.addGrade(79);

        students.put("jeanbos", jean);
        students.putIfAbsent("jacqueslue", jacques);
        students.putIfAbsent("bongamin", alain);

        commandLineInterface(students);
    }

//3

    public static void commandLineInterface(HashMap<String, Student> students) {
        System.out.println("Welcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");

        do {

            for (String key : students.keySet()) {
                System.out.print("|" + key + "| ");
                System.out.println("\n");
            }

            System.out.println("What student would you like to see more information on?\n");

            String userKey = input.getString();

            if (students.containsKey(userKey)) {

                Student currentStudent = students.get(userKey);

                System.out.println("Name: " + currentStudent.getStudentName() + "GitHub Username: " + userKey);
                System.out.println("Current Average: " + currentStudent.getGradeAverage());

            } else {
                System.out.println("Sorry, there's no student with the GitHub username: " + userKey);
            }

            System.out.println("Would you like to see another student?");
        } while (input.yesNo());

        System.out.println("Good bye \\m/");

    }
}