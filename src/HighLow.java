//public class HighLow {
//
//    static  int randomNumber = MethodsExercises.getRandomNumber(1, 100);
//
//    public static int getUsersToGuessNumber() {
//        System.out.println("Guess the number");
//        int usersGuessNum = MethodsExercises.getInteger(1, 100);
//        return usersGuessNum;
//    }
//
//    public static void highLowGame(){
//        int randomNumber = MethodsExercises.getRandomNumber(1, 100);
//        int usersLastGuess;
//
//        do {
//            usersLastGuess = getUsersToGuessNumber();
//            giveHelpfulHint(usersLastGuess, randomNumber);
//
//        } while (usersLastGuess != randomNumber);
//        System.out.println("GOOD GUESS");
//    }
//
//    public static void main(String[] args) {
//        System.out.println(getUsersToGuessNumber());
//    }
//}
