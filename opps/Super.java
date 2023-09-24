class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}
class GermanShepherd extends Dog {
    void guard() {
        System.out.println("German Shepherd is guarding.");
    }
}

public class Super {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        GermanShepherd gs = new GermanShepherd();
        animal.eat();

        dog.eat(); 
        dog.bark();   

        gs.eat();     
        gs.bark();    
        gs.guard();   
    }
}
