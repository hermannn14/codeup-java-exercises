package Practice;

public class Duck {
    private String name;
    private int age;

    public Duck(String name, int age) {
        if (name == null) {
            throw new IllegalArgumentException("Something bad happened!");
        }
        this.name = name;
        this.age = age;
    }
}
