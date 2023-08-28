abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("you are creating a new animal");
    }
    public void eat(){
        System.out.println("animals eat");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("created a horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks on 2 legs");
    }
}
public class Opps {
    public static void main(String[] args) {
        Horse horse = new Horse();
        
    }
}
//abstract class must be declare with abstract keyword
//it has abstarct or non abstract method

