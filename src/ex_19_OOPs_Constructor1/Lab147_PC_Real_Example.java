package ex_19_OOPs_Constructor1;

public class Lab147_PC_Real_Example {
    public static void main(String[] args) {

        Person p1 = new Person();  //DC
        System.out.println(p1.name);
        System.out.println(p1.address);

        Person p2 = new Person("Shaii",56456,"PUN");  //PC
        System.out.println(p2.name);
        System.out.println(p2.address);
    }
}

class Person{

    String name;
    long phone;
    String address;

    //DC
    Person() {

        name = "SSSS";
        phone = 64536;
        address = "BGT";

    }
        //PC
        Person(String name_user,long phone_user,String address_user) {
            this.name = name_user;
            this.phone = phone_user;
            this.address = address_user;

        }
        //Constructor Overloading is allowed.

            Person(String name_user,long phone_user) {
                this.name = name_user;
                this.phone = phone_user;

        }
    }

