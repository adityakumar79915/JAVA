public class Mulcat {
    public static void main(String[] args) {
        try{
            System.out.println(4/0);
        }
        catch(Exception e){
            System.out.println("exception : divide by 0");
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception : divide by 0");
        }
    }
}
