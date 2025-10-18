package ex_26_OOPs_Abstraction_Interface_Class;

public class Lab166_Interface_InterviewQnA {
}

interface I11 {}  // valid interface
interface  I12 {} // valid interface
class A1 {} // Valid class
class B1 {} // valid class

abstract class Run {
    abstract void Run ();
}

class Test1 extends A1 {}

//class Test2 extends A1,B1 { }  // Not Possible because multiple inheritance in class not supported.

class Test3 implements  I11 {}
class Test4 implements  I12 {}
class Test5 implements  I11, I12 { } ;

// class test6 implements I11 extends A1 {} // Not Possible
// interface I3 extends A1 {} // Not Possible

interface I3 {}

interface I4 {
   default void m1() {

    }

    static  void m2(){

    }

    default void m3(){

    }

    // void concrete () {}// Not possible
}