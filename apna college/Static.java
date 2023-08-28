class Student{
    String name;
    static String school;
}
public class Static {
    public static void main(String[] args) {
        Student.school="nps";
        Student student1 =new Student();
        student1.name="aditya";
        System.out.println(student1.school);
    }
}
