public class Person {
    private String name;
    private int age;

    // Non-parameterized constructor (default constructor)
    public Person() {
        name = "Unknown";
        age = 0;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating a Person object using the default constructor
        Person person = new Person();

        // Displaying information
        person.displayInfo();
    }
}
