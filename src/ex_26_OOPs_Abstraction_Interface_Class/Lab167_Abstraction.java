package ex_26_OOPs_Abstraction_Interface_Class;

public class Lab167_Abstraction {

}

abstract class IncompleteAbstract {

    IncompleteAbstract (){
        //Abstract have a constructor
    }

    int a = 10;
    abstract void display1 ();
    void Display2 (){

        a=25;  // change in variable allowed in abstract
        System.out.println("Print");
    }
}


interface IncompleteInterface {

   // IncompleteInterface (){
        // Interface never have a constructor
 //   }

    int a = 10; // final

    void display();

    default void display1(){
     //   a=25;  // change in variable is not allowed in interface
        System.out.println("Default is allowed");
    }

    static void display2(){
        System.out.println("Static is allowed");
    }

}
