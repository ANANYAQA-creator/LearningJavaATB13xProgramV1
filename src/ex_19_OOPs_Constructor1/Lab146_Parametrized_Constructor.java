package ex_19_OOPs_Constructor1;

public class Lab146_Parametrized_Constructor {
    public static void main(String[] args) {


        BabyA b1 = new BabyA();
        System.out.println(b1.name);

        BabyA b2 = new BabyA();
        System.out.println(b2.name);

        //PC

        BabyA b3 = new BabyA("Shivi","64675",2001, 04,10 );
        System.out.println(b3.name); // Shivi
        System.out.println(b3.Adhar_number); // 64675

        BabyA b4 = new BabyA("Amit","65478",2010, 01,27 );
        System.out.println(b4.name); // Amit
    }
}

    class BabyA {

        String name;
        String Adhar_number;
        int year;
        int month;
        int date;

        // DC

        BabyA() {

            name = "Urvi";
            Adhar_number = "47995";
            year = 2000;
            month = 06;
            date = 12;
        }
        // PC

        BabyA(String name_user, String Adhar_number_user, int year_user, int month_user, int day_user) {
            this.name = name_user;
            this.Adhar_number = Adhar_number_user;
            this.year = year_user;
            this.month = month_user;
            this.date = day_user;

        }
    }

