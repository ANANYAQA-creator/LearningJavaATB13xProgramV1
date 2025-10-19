package ex_28_Static;

public class Lab173_RealExsmple {
    public static void main(String[] args) {

    }
}

class ATB{
    static {
        System.out.println("Load the Class, I will execute");
    }
    {
        System.out.println("IIB, This is called when Object is created");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    private String Name; // Non Static
    private String Number;

    static String CourseName = "ATB13x";
    static String Mentor = "Ananya";

    static void DoAssignment () {
        //System.out.println(Number); // Staic method can't access the non static variables
        System.out.println("DoAssignment");
    }

    static void JoinZoomClasses(){
        System.out.println(" Zoom Classes Joined");
    }

    void HowDoAssignment(){
        System.out.println("It is Different");
    }
}
