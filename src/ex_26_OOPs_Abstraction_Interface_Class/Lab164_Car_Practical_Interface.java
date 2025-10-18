package ex_26_OOPs_Abstraction_Interface_Class;

public class Lab164_Car_Practical_Interface {
    public static void main(String[] args) {

        Car1 c1 = new Car1();
        c1.drive();
    }
}


class Car1 implements Engine1,Brakes {

    void drive(){
        StartEngine();
        ApplyBreaks();
        StopEngine();
    }
    @Override
    public void ApplyBreaks() {
        System.out.println("Apply Breaks");
    }

    @Override
    public void StartEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void StopEngine() {
        System.out.println("Stop Engine");
    }

}








interface Brakes {
    void ApplyBreaks();
}

interface  Engine1 {
    void StartEngine();
    void StopEngine();
    default void test (){
        System.out.println("Default Commplete Function");
    }
}


