interface Animal{
    int eyes=2;
    public void walk();

}
interface Herbivore{

}
class Horse implements Animal,Herbivore{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
public class Interface {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        
    }
}
//static jo sabke liye common ho