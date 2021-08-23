package Practice;

public class AssessmentPractice {
    public static void main(String[] args) {
        System.out.println(multiply(5, 6));
        System.out.println(multiply(7.5, 9.9));
        Mallard mallard = new Mallard("Jack", 23, 75);
        getMallardDetails(mallard);
    }
    public static double multiply(int x, int y) {
        return x * y;
    }
    public static double multiply(double x, double y) {
        return x * y;
    }

    public static void getMallardDetails(Mallard mallard) {
        System.out.println("The mallard flies at " + " " + mallard.getFlightSpeed());
    }
}
