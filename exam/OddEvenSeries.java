import java.util.Scanner;

public class OddEvenSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        System.out.println("Even numbers:");
        for (int i = 0; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
