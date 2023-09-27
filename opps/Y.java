class X{
    X(){
        System.out.println("default A");
    }
    X(int A){
        System.out.println(X);
    }
    public class Y extends X{
        Y(){
            System.out.println("default B");
        }
        Y(int A){
            super(10);
            System.out.println(x);
        }
        public static void main(String args[]){
        }
    }
}