package ex_28_Static;

public class Lab174_StaticWebAutomation {
    public static void main(String[] args) {

        Automation T1 = new Automation();
        System.out.println(Automation.driver);

        Automation T2 = new Automation();
        Automation T3 = new Automation();

        System.out.println(T2.driver);
        System.out.println(T3.driver);
    }

}


    class Automation{
        static String driver = "Chrome" ;
    }



