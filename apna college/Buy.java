import java.util.Scanner;
public class Buy {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cash=  sc.nextInt();
        if(cash<10){
            System.out.println("cannot buy any thing");
            System.out.println("get more cash");
        }
        else if(cash>10 && cash<50){
            System.out.println("can buy only one thing");
        }
        else{
            System.out.println("can buy both");
        }

    }
}
