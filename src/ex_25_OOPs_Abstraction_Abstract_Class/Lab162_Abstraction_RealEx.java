package ex_25_OOPs_Abstraction_Abstract_Class;

public class Lab162_Abstraction_RealEx {
    public  void main(String[] args) {

       // Employee e1 = new Employee();   // Can't use the abstract class Employee as Object

        Company c1 = new Company();
        c1.Compute_Pay();
    }

class Company extends  Employee{

    @Override
    double Compute_Pay() {
        return 10000;
    }
}

abstract class Employee{

    private String Name;
    private String Address;
    private int id;

    Employee (){
        System.out.println("Default Constructor");
    }

    Employee(String Name, String Address, int id){
        System.out.println("Constructing an Employee");
        this.Name = Name;
        this.Address = Address;
        this.id = id;
    }

    abstract double Compute_Pay ();

    void mailchek (){
        System.out.println("Mailing a check to " + this.Name + " " + this.Address );

    }
}
}