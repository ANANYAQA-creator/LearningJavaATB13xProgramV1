package ex_25_OOPs_Abstraction_Abstract_Class;

public class Lab161_AB_Cars {
    public static void main(String[] args) {

        WagonR wr = new WagonR();
        wr.drive();

        // Engine e1 = new Engine(); // This is abstract in nature.
    }
}









abstract class Engine {

    abstract void StartEngine();
    abstract void StopEngine();

    void CheckEngine(){
        System.out.println("Everything is good,Engine is working");
    }
}

class WagonR extends Engine {

    @Override
    void StartEngine() {
        System.out.println("Start the car");
    }

    @Override
    void StopEngine() {
        System.out.println("Stop the car");
    }

    void drive() {

        CheckEngine();
        StartEngine();
        StopEngine();
    }
}

