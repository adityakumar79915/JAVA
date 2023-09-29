import java.io.*;
public class Throws {
    public static void main(String[] args) {
        fetchFile();
    }
    catch(IOException ex){
        System.out.println(ex);
    }
}
