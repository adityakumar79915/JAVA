class shyam{
    int x = 10;
}
public class Ram extends shyam {
    int x =20;
    public void display()
    {
        System.out.println(x);
        System.out.println(super.x);
        System.out.println(x+super.x);
    }
    public static void main(String[] args) {
        Ram b = new Ram();
        b.display();
    }
}
