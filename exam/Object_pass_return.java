import java.util.Scanner;
public class Object_pass_return {
    int length,breadth,area;
    Object_pass_return area1(Object_pass_return object1)
    {
        object1=new Object_pass_return();
        object1.length=this.length;
        object1.breadth=this.breadth;
        object1.area=object1.length*object1.breadth;
        return object1;
    }
    public static void main(String[] args) {
        Object_pass_return obj=new Object_pass_return();
        Scanner s = new Scanner(System.in);
        System.out.println("enter length:");
        obj.length=s.nextInt();
        System.out.println("enter breadth:");
        obj.breadth=s.nextInt();
        Object_pass_return a = obj.area1(obj);
        System.out.println("area:"+a.area);

    }
}
