package ex_24_SuperKeyword;

public class Lab158_SuperKeyword {
    public static void main(String[] args) {

        Car car1 = new Car(100);
        car1.Display();
    }
}

class Vehicle {
    public int maxSpeed = 180;

    Vehicle() {
        System.out.println("Default Constructor");
    }

    Vehicle(int a) {
        System.out.println("Parameterised Constructor");
    }

    //Method Overlaoding = same name function with different arguments.

    void message() {
        System.out.println("Type1");
    }

    void message(int a) {
        System.out.println("Type2");
    }

    int message(String a) {
        System.out.println("Type4");
        return 0;
    }

    void Display() {
        System.out.println("Vehicle Parent");
    }
}

class Car extends Vehicle {
    private int maxSpeed = 281;

    Car() { //Default Constructor
        super();  // calling parent's default constructor
    }

    Car(int a) {  //Parameterised Constructor
        super(a); // calling parent's parameterised constructor
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    void Display() {
        System.out.println(super.maxSpeed); // Parent's instance variable call
        System.out.println(this.maxSpeed); // this is call my variable
        System.out.println("Hi Override");
    }
}
