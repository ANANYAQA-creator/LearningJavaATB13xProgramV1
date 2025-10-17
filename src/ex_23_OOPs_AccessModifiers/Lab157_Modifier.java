package ex_23_OOPs_AccessModifiers;

public class Lab157_Modifier {
}

class Father {

   private int gold = 10;
   int Car = 1;
   public int ThreeBHK = 1;
}

class Son extends Father{
    void weCanUse(){
     //   System.out.println(gold); // its private so restricted to use
        System.out.println(Car); // can use the Car
        System.out.println(ThreeBHK);  // can use the Three BHK
    }
}