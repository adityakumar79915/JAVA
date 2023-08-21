import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();

        scanner.nextLine(); // Consume the newline character left by nextDouble()

        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();

        System.out.println("You entered:");
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("String: " + stringValue);

        scanner.close();
    }

}
