package ex_27_Instance_Initialization_Block_IIB;

public class Lab168_IIB {

    // IIB:-  Instance Initialization Block
    // It will be executed when Object is created.

    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A();
    }
}

class A {
    A(){
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
        System.out.println("Static");
    }

}


