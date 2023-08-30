public class CommandLineArgumentsExample {
    public static void main(String[] args) {
        if (args.length >= 2) {
            String name = args[0];
            int age = Integer.parseInt(args[1]);

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        } else {
            System.out.println("Usage: java CommandLineArgumentsExample <name> <age>");
        }
    }
}
