public class Throw {
    static void checkage(int age){
        if(age<18){
            throw new ArithmeticException("access denied - you must be atlesat 18 year")
        }
        else{
            System.out.println("access granted - you are old enough!");
        }
    }
    public static void main(String[] args) {
        checkage(15);
    }
}
