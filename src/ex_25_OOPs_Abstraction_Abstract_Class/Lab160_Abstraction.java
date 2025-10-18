package ex_25_OOPs_Abstraction_Abstract_Class;

public class Lab160_Abstraction {

    public static void main(String[] args) {

        // Able to create object/instance of Car class.
        Car c1= new Car();

        // Not able to create object/instance of Father class.  Father is abstract; it's can not be instantiated
        // Father f1 = new Father();  // this is abstract in nature

        Child child = new Child();
        Father f2 = new Child();// Dynamic Dispatch is possible
        child.loan50K();
    }
}

class Car {
    // This is the concrete class.
    // This does not have the abstract method.
    void done (){
    }
}

abstract class Father {

    //This is the abstract function
     abstract void loans50K ();

    //This is a complete function.
    void loan25K(){
        System.out.println("Given the loan of 25K");

    }
}
class Child extends Father {

    void loan50K (){
        System.out.println("Son has to pay loan of 50K");
    }

    @Override
    void loans50K() {

    }
}