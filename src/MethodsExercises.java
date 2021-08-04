public class MethodsExercises {

    //1.
    //Create four separate methods. Each will perform an arithmetic operation:

    public static int add(int valueOne, int valueTwo) {
        return valueOne + valueTwo;
    }

    public static int subtract(int valueOne, int valueTwo) {
        return valueOne - valueTwo;
    }

    public static int multiply(int valueOne, int valueTwo) {
        return valueOne * valueTwo;
    }

    public static double divide(double valueOne, double valueTwo) {
        return valueOne/valueTwo;
    }

    public static void main(String[] args) {

        System.out.println(add (23, 5));
        System.out.println(15==add(23,5));
        System.out.println(subtract(45,20));
        System.out.println(multiply(7,9));
        System.out.println(divide(5,2));

    }
}
