public class Array {
    public static void main(String[] args) {
        int[] number = new int[5];
        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;
        number[4]=50;
        System.out.println("first element : "+number[0]);
        System.out.println("second element : "+number[1]);
        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }
    }
}
//An array in Java is a data structure that allows you to store multiple values of the same type
//Zero-based Indexing: Array indices start from 0. The first element is at index 0, the second at index 1, and so on.