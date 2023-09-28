class FinallyBlock {
    public static void main(String[] args) {
        try{
            System.out.println(4/0);
        }
        catch(RuntimeException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally execuuted");
        }
        System.out.println("end");
    }
}
