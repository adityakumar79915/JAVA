class A{
    public void display()
    {
        System.out.println("hello 1");
    }
}
public class B extends A{
    public void display(){
        System.out.println("hello 2");
    }
    public void greet(){
        System.out.println("how are you");
    }
    public void show(){
        display();
        greet();
        super.display();
        //super.greet();
    }
    public static void main(String[] args) {
        B b = new B();
        b.show();

    }
}