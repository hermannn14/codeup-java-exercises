public class Person {
    private String name;

    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
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
        Person person = new Person("Tyson");
        System.out.println(person.getName());
        person.sayHello();
        person.setName("Mike");
        System.out.println(person.getName());
    }
}
