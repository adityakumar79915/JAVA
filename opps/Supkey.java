class Sup{
    int x = 10;
}
public class Supkey extends Sup {
    int x = 20;
    public void display(){
        System.out.println(x);
        System.out.println(super.x);
        System.out.println(x+super.x);
    }
    public static void main(String[] args) {
        Supkey b = new Supkey();
        b.display();
    }
}
