package ex_28_Static;

public class Lab172_Static {
    public static void main(String[] args) {

    }
}


class B{

    static {
        System.out.println(" Static Block[once called] , when class is loaded");
    }

    int a =10; // Non-Static
    static int b =20; // Static

    void Display(){
        System.out.println(b);
        System.out.println("Non-Static Function");
    }

    static void CommonToAll () {
      //  System.out.println(a);
        System.out.println("Static Function");
    }

    static {
        //Whatever[No usage] you are going to use in the automation also. Good news.
    }
}
