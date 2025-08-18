package ex_16_Array;

public class Lab127_Array_CLI_For_each_Loop {
    public static void main (String [] args){

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        System.out.println("With Object o");
    for (Object o: args){
        System.out.println(o);
    }
    }
}
