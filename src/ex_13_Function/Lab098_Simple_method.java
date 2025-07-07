package ex_13_Function;

public class Lab098_Simple_method {
    public static void main(String[] args) {
        myname();
        int mineAge = myAge();
        System.out.println(mineAge);

        boolean married_or_not = is_Shiv_married();
        System.out.println(married_or_not);


    }
    static void myname(){
        System.out.println("Shiv");
    }

    static int myAge() {
       // System.out.println("My Age is mentioned below");
        return 24;
    }
        static boolean is_Shiv_married() {
            return false;
        }

            static float value_of_pi () {
                return 3.14f;
            }

            static String Love_animal() {
                return "Parrot";
    }
            }


