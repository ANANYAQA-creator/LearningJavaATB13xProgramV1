package ex_23_OOPs_AccessModifiers.Criminal;

import ex_23_OOPs_AccessModifiers.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);

        thief.gun = 100;
       // thief.CanIshoot();

    }
}