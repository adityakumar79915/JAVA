class Testconstructor {
    int a,b;
    Testconstructor()
    {
        System.out.println("default constructor");
        a=10;
        b=20;
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);
    }
}
class Mainconstructor{
    public static void main(String[] args) {
        Testconstructor obj =new Testconstructor();
    }
}