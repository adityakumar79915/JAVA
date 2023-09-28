public class Multiplecatch {
    public static void main(String[] args) {
        try{
            int a[]= new int[5];
            a[5]=30/0;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occur");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(RuntimeException e){
            System.out.println("Parent Exception Occurs");
        }
        System.out.println("end of the code");
    }
}
