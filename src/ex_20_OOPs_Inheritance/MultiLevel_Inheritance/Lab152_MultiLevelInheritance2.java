package ex_20_OOPs_Inheritance.MultiLevel_Inheritance;

public class Lab152_MultiLevelInheritance2 {
    public static void main(String[] args) {


        Son Amit = new Son();
        //  Son s1 = new Father();      // Not Possible
        //  Son s2 = new Grandfather(); // Not Possible

        Grandfather gf = new Son(); //Dyanmic Dispatch //Possible
        gf.gf();
        gf.home();

        Grandfather gf1 = new Father(); //Dyanmic Dispatch //Possible
        gf1.home();




    }
}