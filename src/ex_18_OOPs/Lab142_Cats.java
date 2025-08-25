package ex_18_OOPs;

public class Lab142_Cats {
    public static void main(String[] args) {

        Cat c1 = new Cat();
        new Cat();  // OBJECT
        Cat c2;  // OBJECT is not created for c2
        c1.running();
        //c2.running();  // Object is not created for c2
        new Cat().running();// Object is created here for Cat();
    }
}

    class Cat {  //CLASS
        String name;

        void running (){
            System.out.println("Running");

        }
    }

