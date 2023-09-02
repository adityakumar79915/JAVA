public class Student {
    String name;
    int rollno;
    int age;
    void info(){
        System.out.println("name:"+name);
        System.out.println("rollno:"+rollno);
        System.out.println("age:"+age);
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name="aditya";
        student.rollno=02;
        student.age=19;
        student.info();
    }
}
