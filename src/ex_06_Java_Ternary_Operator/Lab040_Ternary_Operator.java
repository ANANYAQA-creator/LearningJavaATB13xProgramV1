package ex_06_Java_Ternary_Operator;

public class Lab040_Ternary_Operator {
    public static void main(String[] args) {

        // Ternary Operator :- conditional operator ,
        // Syntax  :-  Result = condition ? expression1 : expression 2 ;
 // Right Age to Vote
        int age =10;
        int age1 = 22;

        String CanIvote = age > 18 ? "Yes" : "No" ;
        String CanIVote1 = age1 > 18 ? "Yes" : "No" ;
        System.out.println(CanIvote);
        System.out.println(CanIVote1);

        // Is Number :- Positive or Negative

        int Number1 = 5 ;
        int Number2 = -10;

        String IsNumber1 = Number1 > 0 ? "Positive" : "Negative" ;
        String IsNumber2 = Number2 > 0 ? "Positive" : "Negative" ;

        System.out.println(IsNumber1);
        System.out.println(IsNumber2);
    }
}
