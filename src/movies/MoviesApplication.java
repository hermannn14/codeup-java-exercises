package movies;

public class MoviesApplication {
    public static void main(String[] args) {

    }

    private static boolean executeUserChoice() {
        boolean running = true;

        while (running) {
            System.out.println(returnMenuDisplay());

            int response = promptAndReturnUserChoice();

            running = executeUserChoice();
        }

        switch(choice) {
            case 0:
                System.out.println("Good bye!");
                continueRunningApp = false;
                break;
            case 1: // View all movies
                for(Movie movie : MoviesArray.findAll()) {
                    System.out.println("%s - %s", movie.getName(), movie.getCategory());
                }
                break;
        }
        return continueRunningApp;
    }

    private static int promptAndReturnUserChoice() {
        Input input = new Input();
        System.out.println("Enter your choice: ");
        int userResponse = input.getInt(0, 5);
        return userResponse;
    }

    private static String returnMenuDisplay() {
        String menu = "What would you like to do?\n" +
                "\n" +
        "0 - exit\n" +
        "1 - view all movies\n" +
        "2 - view movies in the animated category\n" +
        "3 - view movies in the drama category\n" +
        "4 - view movies in the horror category\n" +
        "5 - view movies in the scifi category";

        return menu;

    }
}
