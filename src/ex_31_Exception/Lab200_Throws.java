package ex_31_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab200_Throws {
    public static void main(String[] args) {

    }
    //This one using try-catch
    static void t (){
        try {
            FileInputStream fileInputStream= new FileInputStream("C://abc.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // can use alternate way also "throws"
    static  void t1() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("C://test.txt");
    }
}
