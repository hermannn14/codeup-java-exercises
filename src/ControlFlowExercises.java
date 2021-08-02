public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println( i);
//            i++;
//        }
//
//        int i = 2;
//        do {
//            System.out.println("i");
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i = i - 5;
//        }
//        while (i >= -10);


        long i = 2;
        do {
            System.out.println(i);
            i = (long) Math.pow(i, 2);
        }
        while (i <= 1000000);


    }
}
