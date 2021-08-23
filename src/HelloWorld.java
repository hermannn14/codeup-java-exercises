public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.print("Hello World");
        System.out.print("\n");
        System.out.print("Hello World");
        System.out.print("\n");
//        "javac HelloWorld.java"


        int myFavoriteNumber = 9;
        System.out.println(myFavoriteNumber);

        String myString = "I like to move it";
        System.out.println(myString);

        String myString = "$";
        System.out.println(myString); // The character value still prints out

        String myString = 3.14159;
        System.out.println(myString); // When you run this you get an error because double cannot be converted

        long myNumber;
        System.out.println(myNumber); // The variable has not been initialized

        long myNumber = (long) 3.14;
        System.out.println(myNumber); //long has tto be placed in front of the value in order for it to run properly

        long myNumber = 123L;
        System.out.println(myNumber);

        long myNumber = 123;
        System.out.println(myNumber);

        float myNumber = 3.14;
        System.out.println(myNumber); // Incompatible types. This happens because a float is a single precision and floating point go up to 7 significant digits

        int x = 5;
        System.out.println(x++);
        System.out.println(x); //

          int x = 5;
          System.out.println(++x);
          System.out.println(x); // There are two different results due to the order of precedence between increment and decrement

//         String id = class; // There's an error message when trying to create a variable class. Illegal start of expression. An identifier is needed

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        int three = (int) "three";









    }

}
