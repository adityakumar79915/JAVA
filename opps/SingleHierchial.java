class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    void run() {
        System.out.println(name + " is running.");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    void fly() {
        System.out.println(name + " is flying.");
    }
}

class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}

class Cat extends Mammal {
    public Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class SingleHierchial {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        Bird bird = new Bird("Tweety");

        dog.eat();
        dog.run();
        dog.bark();

        cat.eat();
        cat.run();
        cat.meow();

        bird.eat();
        bird.fly();
    }
}
