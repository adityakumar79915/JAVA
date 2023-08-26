import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //how to take input
        Scanner sc = new Scanner(System.in);
        System.out.println("input your age :");
        //float age = sc.nextFloat();
        //System.out.println(age);
        String name = sc.nextLine();
        System.out.println(name);
    }
}
