package ex_09_Switch_Statement;

public class Lab064_JDK13 {
    public static void main(String[] args) {

        // 1. JDK >13
        // 2. No needed of break keyword
        // 3. Only single line supported not the multiple line
        // 4. -> arrow will be used
        int itemcode = 001 ;
        switch(itemcode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");
            default -> System.out.println("Not allowed");
        }



    }
}
