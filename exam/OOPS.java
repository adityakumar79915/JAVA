class student{
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
}
