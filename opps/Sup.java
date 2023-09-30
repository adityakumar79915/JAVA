class A{
    public void display(){
        System.out.println("hello 1");
    }
}
public class Sup extends A {
    public void display(){
        System.out.println("hello 2");
    }
    public void show(){
        display();
        super.display();
    }
    public static void main(String[] args) {
        Sup b = new Sup();
        b.show();
    }
}
