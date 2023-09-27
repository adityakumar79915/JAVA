public class Exception {
    public static void main(String[] args) {
        try{
            int div=509/0;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("end of the code");
    }
}
