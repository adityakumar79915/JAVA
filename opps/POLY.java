//POLYMORPHISM
class Student{
    String name;
    int age;
    public void printInfo(String name) {
        System.out.println(name);
    }
    public void printInfo(int age) {
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}

public class POLY {
    public static void main(String[] args) {
        Student s1= new Student();//new keyword is used to allocate space in memory where object is stored
        s1.name="aditya";
        s1.age=24;

        s1.printInfo(s1.name, s1.age);
    }
}
