class X implements Runnable{
    public void main(){
        for(int i =0 ; i<=5; i++){
            System.out.println("the thread x is:",+i);
            System.out.println("end of the the thread x");
        }
    }
}
class RunnableTest{
    public static void main(String[] args) {
        X r = new X();
        Thread threadx = new Thread(r);
        threadx.start();
        System.out.println("the end of main thread");

    }
}