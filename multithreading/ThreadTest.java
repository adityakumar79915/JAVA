class A extends Thread{
    public void run(){
        for(int i=0; i<=5; i++){
            System.out.println(+i);
        }
        System.out.println(("exit from thread A"));
    }
}
class B extends Thread{
    public void run(){
        for(int j=0; j<=5; j++){
            System.out.println(+j);
        }
        System.out.println(("exit from thread B"));
    }
}
class ThreadTest {
    public static void main(String[] args) {
        A a =new A();
        a.start();
        B b = new B();
        b.start();
        System.out.println("main thread ends");
    }
}
