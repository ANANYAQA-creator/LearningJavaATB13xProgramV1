package ex_28_Static;

public class Lab171_Static_SIB {
    public static void main(String[] args) {

        A ref1 = new A(10);
        A ref2 = new A(11);

        System.out.println(ref1.a);
        System.out.println(A.b);
        System.out.println(ref2.a);

        System.out.println(ref1.b);
        System.out.println(ref2.b);

        ref1.DisplayValue();
        ref2.DisplayValue();

        A.StaticMethod();
    }
}

class A {
    int a; // non static , instance variable.
    static  int b = 20;  // static, this is shared between the Objects.


    A(int a) {
        this.a = a;
    }

    void DisplayValue(){
        System.out.println(this.a);
        System.out.println(b); // Static variable is allowed in instance method
    }

    static void StaticMethod (){
        System.out.println("It will be called when class is loaded");
        //System.out.println(this.a); // Methods cannot access non-static variables in a static function.
    }

}
