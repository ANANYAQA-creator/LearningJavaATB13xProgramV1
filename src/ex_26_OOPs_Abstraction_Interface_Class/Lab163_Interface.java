package ex_26_OOPs_Abstraction_Interface_Class;

public class Lab163_Interface {
    public static void main(String[] args) {

        Rectangel r1 = new Rectangel();
        r1.getArea(10,15);

        Square sq = new Square();
        sq.getArea(5,4);
    }
}


class Rectangel implements Polygon {

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of Rectangle :- " + length * breadth);
    }
}


class Square implements Polygon {

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of Square :- " + 3.14 * length * breadth );
    }
}

interface Polygon {

    void getArea(int length, int breadth);
    // void complete(){ }  // This is not possible in interface, but we can achieve it via default keyword

    default void complete(){
        System.out.println("This function is possible via default keyword");
    }

    // Multiple default function also allowed
    default void complete2(){
        System.out.println("This function2 is possible via default keyword");
    }

    static void staticComplete (){
        System.out.println("Static function in interface allowed,complete ");
    }
}

abstract class A {
    abstract void m1();
    void complete(){
        System.out.println("Completed..!!");
    }
}