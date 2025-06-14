package ex_06_Java_Ternary_Operator;

public class Lab043_Nested_Ternary {
    public static void main(String[] args) {

        // Nester ternary can be conditon2 under the condition1.

        // Syntax :-  RESULT = Condition1 ? EXPRESSION1 : (Condtion2 ? Expression2 : Expression3)

        /*
         IF  age =23  - adult or senior citizen
         age < 18  - minor
        18 < age > 65  :- Adult
        age >65  - Senior Citizen
         */
           int age = 23; //  Adult
        String Result = (age < 18) ? "Minor" : ( age < 65  ? "Adult" : "Senior Citizen") ;
        System.out.println(Result);

        int age1 = 16;   // Minor
        String Result1 = (age1 < 18) ? "Minor" : ( age1 < 65  ? "Adult" : "Senior Citizen") ;
        System.out.println(Result1);

        int age2 = 67;  // Senior citizen
        String Result2 = (age2 < 18) ? "Minor" : ( age2 < 65  ? "Adult" : "Senior Citizen") ;
        System.out.println(Result2);

    }
}
