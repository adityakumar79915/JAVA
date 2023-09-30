class A{
    A(){
        System.out.println("default a");
    }
    A(int x){
        System.out.println(x);
    }
}  

public class Supcon extends A{
    Supcon(){
        System.out.println("default b");
    }
    Supcon(int x){
        super(10);
        System.out.println(x);
    }
    public static void main(String[] args) {
        Supcon b = new Supcon();
    }
}
