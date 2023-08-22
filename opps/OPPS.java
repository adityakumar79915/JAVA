class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);//
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("constructor called");
    }
}
public class OPPS{
    public static void main(String[] args) {
        Student s1= new Student();//new keyword is used to allocate space in memory where object is stored
        s1.name="aditya";
        s1.age=22;
        s1.printInfo();
        
    }
}