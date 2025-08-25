package ex_19_OOPs_Constructor1;

public class Lab144_Constructor_RealEx {
    public static void main(String[] args) {

        WebAutomation w1 = new WebAutomation();

    }
}

class WebAutomation {
    // DEFAULT CONSTRUCTOR

    WebAutomation(){
        System.out.println("I want to read a CSV file");
        System.out.println("Open the Page before loading the scripts");
        System.out.println("You can do anything which you can do, when Object is created");
    }
}
