package ex_31_Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab199_Exception_IQ2 {
    public static void main(String[] args) {

        System.out.println("Starting");

        try {
            FileReader f = new FileReader(new File("/D://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End");
    }
}
