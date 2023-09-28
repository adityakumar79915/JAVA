public class Final {
    public static void main(String[] args) {
        try{
            int data = 100/0;
            System.out.println(data);
        }
        catch(RuntimeException e){
            System.out.println("cant't divide integer by 0!");
        }
        finally{
            System.out.println("the 'try catch' is finished.");
        }
    }
}
