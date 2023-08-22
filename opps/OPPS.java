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
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){
        
    }
}
public class OPPS{
    public static void main(String[] args) {
        Student s1= new Student();//new keyword is used to allocate space in memory where object is stored
        s1.name="aditya";
        s1.age=24;

        Student s2= new Student(s1);
        s2.printInfo();
        
    }
}