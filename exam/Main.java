import java.util.Scanner;;
class PrimeChecker {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }

static int getinput(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number");
    int num = Scanner.nextInt();
    return num;
}

public class Main {
    public static void main(String[] args) {
        int num=getinput();
        if (PrimeChecker.isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
    
        }
    }
}
}
