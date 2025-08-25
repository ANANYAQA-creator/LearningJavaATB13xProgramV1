package ex_20_OOPs_Inheritance.MultiLevel_Inheritance;

public class Lab151_MultiLevelInheritance {
    public static void main(String[] args) {


        Grandfather gf = new Grandfather();
        gf.gf();
        gf.home();

        System.out.println("------------------");

        Father f = new Father();
        f.f();
        f.home();
        f.gf();
        System.out.println("------------------------");

        Son s = new Son();
        s.gf();
        s.f();
        s.s();
        s.home();

    }

}
