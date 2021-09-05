package javabeans;

public class BeanTest {
    public static void main(String[] args) {
        Album darkSide = new Album(1, "Pink Floyd", "Dark Side of the Moon", 1970, 1000000, "Rock");
        Album darkSide = new Album(1, "Pink Floyd", "The Wall", 1975, 2000000, "Rock");

        Author markTwain = new Author(1, "Mark", "Twain");
        Author nietzsche = new Author(2, "Friedrich", "Nietzsche");

        Quote quote1 = new Quote("Hi, I am Mark Twain", markTwain);
        Quote quote1 = new Quote("That which does not kill you makes you stronger", nietzsche);

    }
}
