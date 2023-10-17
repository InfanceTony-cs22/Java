public class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Person object using the parameterized constructor
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 25);
    }
}
