class x implements Runnable
{
    public void run(){
        for(int i=0; i<=5; i++)
        System.out.println("the thread x is"+i);
        System.out.println("end of the thread x");
    }
}
public class RunnableTest {
    public static void main(String[] args) {
        x r = new x();
        Thread threadx = new Thread(r);
        threadx.start();
        System.out.println("the end of the main thread");
    }
}
