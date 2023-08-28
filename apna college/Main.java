class Person {
    String name; // instance variable

    Person(String name) {
        // Using "this" to distinguish between instance variable and constructor parameter and this function is also used in constructor chaining
        this.name = name;
    }

    void introduce() {
        System.out.println("Hello, my name is " + this.name);
    }

    void updateName(String newName) {
        this.name = newName;
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.introduce(); // Output: Hello, my name is Alice
        
        person.updateName("Bob");
        person.introduce(); // Output: Hello, my name is Bob
    }
}
