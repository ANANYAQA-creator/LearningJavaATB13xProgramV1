package ex_09_Switch_Statement;

public class Lab065_JDk13_Multiple_match {
    public static void main(String[] args) {

        // Multiple matches allowed with comma separated

        int itemcode = 012 ;
        switch(itemcode) {
            case 001, 002, 003 -> System.out.println("This is a electrical gadget");
            case 004, 005, 006 -> System.out.println("This is a mechanical gadget");
            case 007, 015, 013 -> System.out.println("This is a gaming gadget");
            case 010, 011, 012 -> System.out.println("This is a Electronics gadget");
            default -> System.out.println("Not allowed");

        }
    }
}
