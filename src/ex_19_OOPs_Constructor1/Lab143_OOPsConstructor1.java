package ex_19_OOPs_Constructor1;

public class Lab143_OOPsConstructor1 {
    public static void main(String[] args) {


    Baby b1 = new Baby();

    }
}

class Baby{

    //Attributes, instance variable, Member Variable, Data memeber
    String name;
    // DEFAULT CONSTRUCTOR - has same name as class name(Baby)
    // Use = Fetch data from MySQL databse
    // Read from csv,xlsx file
    //Open a file and read the data [json,txt. testdata.txt]

Baby(){
    System.out.println("I am DEFAULT CONSTRUCTOR");
}



    // Behaviour ,Functions, Member functions, methods,
    void crying (){
        System.out.println("cry");
    }
    void sleeping (){
        System.out.println("sleep");
    }
    void eating (){
        System.out.println("eat");
    }
}