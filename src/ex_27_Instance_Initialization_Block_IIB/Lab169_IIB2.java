package ex_27_Instance_Initialization_Block_IIB;

public class Lab169_IIB2 {


    public static void main(String[] args) {

        new A1();

        // IIB:-  Instance Initialization Block
        // It will be executed when Object is created.

    }
}

class A1 {
    A1(){
        System.out.println("Default Constructor");
    }
    {
        System.out.println("Hello I am IIB.");
        System.out.println("If you want to execute or call something when object is created.");

        // MySQL connection
        // Read a csv and xlsx file
        // read json,xml file
        // read a text or environment file
    }
    {
        System.out.println(" I am IIB2");
    }
    {
        System.out.println(" I am IIB3");
    }

    static {
        System.out.println("1:- SIB: Static Initialization Block");
    }

}


