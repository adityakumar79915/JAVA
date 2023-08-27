import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = 0;
        do{
            System.out.println("input a number");
            number = sc.nextInt();
            System.out.println("here is your name");
            System.out.println(number);
        }
        while(number>=0);
        System.out.println("the end");
    }
}
