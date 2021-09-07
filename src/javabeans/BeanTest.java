package javabeans;

import java.util.ArrayList;
import java.util.Arrays;

public class BeanTest {
    public static void main(String[] args) {
        Album darkSide = new Album(1, "Pink Floyd", "Dark Side of the Moon", 1970, 1000000, "Rock");
        Album theWall = new Album(1, "Pink Floyd", "The Wall", 1975, 2000000, "Rock");

        Author markTwain = new Author(1, "Mark", "Twain");
        Author nietzsche = new Author(2, "Friedrich", "Nietzsche");

        Quote quote1 = new Quote(1,"Hi, I am Mark Twain", markTwain);
        Quote quote2 = new Quote(2,"That which does not kill you makes you stronger", nietzsche);

        System.out.println(quote1);

        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(quote1);
        quotes.add(quote2);

        for (Quote quote : quotes) {
            System.out.println(quote);
        }

        System.out.println(Arrays.toString(quotes.toArray()));

    }
}
