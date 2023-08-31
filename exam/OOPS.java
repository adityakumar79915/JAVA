/*class student{
    static String school;
    String name;
}
public class OOPS {
    public static void main(String[] args) {
        student.school="nps";
        student s1 = new student();
        student s2 = new student();
        s1.name="aditya";
        s2.name="sinha";
        System.out.println((s1.school));
        System.out.println(s2.school);
    }
} */

interface Animal{
    void walk();
}
class Horse implements Animal{
    public void walk(){
        System.out.println("horse walks on 4 legs");
    }
}
class Chicken implements Animal{
    public void walk(){
        System.out.println("chicken walks on 2 legs");
    }
}
public class OOPS{
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        Chicken chicken = new Chicken();
        chicken.walk();
    }
}
