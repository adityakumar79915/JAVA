public class Logical {
    public static void main(String[] args) {
        //logical opaerator
        int a=30;
        int b=40;
        if(a<50 && b<50){
            System.out.println("both a and b is less then 50");
        }
        int c =40;
        int d=60;
        if(c<50 || d<50){
            System.out.println("at least one is less than 50");
        }
        boolean isAdult =false;
        if(!isAdult==true){
            System.out.println("is adult");
        }
        else{
            System.out.println("not adult");
        }
    }
}
