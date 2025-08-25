package ex_20_OOPs_Inheritance.Single_Inheritance;

public class Lab149_SI_Realexample {

    public static <Testcase1> void main(String[] args) {

        TC1_SI_ex tc1 = new TC1_SI_ex();
        tc1.RunningTC1();

        TC2_SI_ex tc2 = new TC2_SI_ex();
        tc2.RunningTC2();

        Lab150_CommonToAll c1 = new Lab150_CommonToAll();
        TC1_SI_ex tc3 = new TC1_SI_ex();
        Lab150_CommonToAll c2 = new TC1_SI_ex();  //Dynamic Dispatch(extends)
      //  TC1_SI_ex tc4 = new Lab150_CommonToAll(); // Not possible

    }
}
