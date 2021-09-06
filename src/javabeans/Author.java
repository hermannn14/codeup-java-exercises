package javabeans;

import java.io.Serializable;

public class Author implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    public Author() {
    }

    public Author(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
