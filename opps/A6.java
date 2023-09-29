interface printable{
    void print();
}
class A6 {
    public void print(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        A6 obj = new A6();
        obj.print();
    }
}
//we use interface to acheive abstraction
//it allows multiple inheritence
