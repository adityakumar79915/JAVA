class PThread1 extends Thread{
    public void run(){
        System.out.println("child 1 is started");
    }
}
class PThread2 extends Thread{
    public void run(){
        System.out.println("child 2 is started");
    }
}
class PTest {
    public static void main(String[] args) {
        PThread1 pt1= new PThread1();
        pt1.setPriority(1);
        PThread2 pt2 = new PThread2();
        pt2.setPriority(9);
        pt1.start();
        pt2.start();


    }
}
