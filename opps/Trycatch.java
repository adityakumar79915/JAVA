public class Trycatch{
    public static void main(String[] args) {
        try{
            int[] mynumbers ={10,1,2,3,5,11};
            System.out.println(mynumbers[10]);
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
    }
}
