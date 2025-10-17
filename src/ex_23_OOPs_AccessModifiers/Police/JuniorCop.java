package ex_23_OOPs_AccessModifiers.Police;

public class JuniorCop {
    public static void main(String[] args) {

        Cop jrCop = new Cop(5);

        jrCop.gun = 5;
        jrCop.CanIshoot();
        jrCop.thisDefault();
    }
}
