public class Person {
    private String name; // this is a field (variables associated with classes)

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){ // This is a parameter
//TODO: change the name property to the passed value
        this.name = name;
        System.out.println("The name entered is: " + name);
    }
    public void sayHello(){
        System.out.println("Hello, " + name);
//TODO: print a message to the console using the person's name
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person Herman = new Person("Herman"); // This is person's object
        System.out.println(Herman.getName());
        Herman.sayHello();
        Herman.setName("Mike");
        System.out.println(Herman.getName());
        Herman.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}
