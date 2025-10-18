package ex_26_OOPs_Abstraction_Interface_Class;

public class Lab165_Multiple_Inheritnace_Interface {
    public static void main(String[] args) {

        Child c1= new Child();
        c1.money();
    }
}


interface Father1 {
    void money();

}

interface Father2 {
    void money();

}

class Child implements Father1,Father2 {


    @Override
    public void money() {
        System.out.println("Child owns money of Father1 and Father2");
    }
}