package ex_21_OOPs_Polymorphism.MethodOverLoading;

public class Real_Method_OverLoading {

    public static void main(String[] args) {
        Home h1 = new Home();

        h1.task();
        h1.task(3);
        h1.task(true);
    }



}

class Home{

    void task (){
        System.out.println("Task1");
    }

    int task(int a){
        System.out.println("Task 1");
        return a;
     }

     boolean task(boolean a) {
        return true;
     }
}
