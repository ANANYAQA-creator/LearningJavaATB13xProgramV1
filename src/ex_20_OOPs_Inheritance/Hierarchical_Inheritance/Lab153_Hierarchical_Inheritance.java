package ex_20_OOPs_Inheritance.Hierarchical_Inheritance;

public class Lab153_Hierarchical_Inheritance {
    public static void main(String[] args) {

        Father f1 = new Father();
        f1.home();

        Shivam s1 = new Shivam();
        s1.home();

        Aakash a2 = new Aakash();
        a2.home();

        Amit a3 = new Amit();
        a3.home();
    }
}
    class Father {

        void home(){
            System.out.println("2BHK");
        }
    }

    class Shivam extends Father {

        void s1() {
            System.out.println("s1 = Shivam");
        }
    }

    class Aakash extends Father {

        void a2() {
            System.out.println("a2= aaksah");
        }
    }

    class Amit extends Father{

        void a3(){
            System.out.println("a3= Amit");
        }
    }


