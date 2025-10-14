package ex_21_OOPs_Polymorphism.MethodOverRiding;

public class Lab155_MethodOverRiding {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.sound();
    }
}

// Method overload can be in the same class
// Method overrise are in different class


class Animal {

    void sound(){
        System.out.println("Default Sound...!!!");
    }
}

class Dog extends Animal {

    @Override
    void sound(){
        System.out.println("bark..!!");
    }

    void methodOverload(){

    }

    void methodOverload(int a){

    }
}
