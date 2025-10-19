package ex_29_ENUM;

public class Lab175_ENUM {
    public static void main(String[] args) {

        System.out.println(DAY.MONDAY);
        System.out.println(PROJECT_Names.VWO);
    }
}

enum DAY {
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY

}

enum PROJECT_Names{
    Google,RestAssured,VWO,Katalon
}

// Instead of Below can use ENUM :-

//class A{
//    String[] days = {"Mon","Tue", "Wed", "Thurs","Fri","Sat","Sun"};
//}
