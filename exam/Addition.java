public class Addition {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Addition addition = new Addition();
        int sum = addition.add(num1, num2);

        System.out.println("Sum: " + sum);
    }
}

