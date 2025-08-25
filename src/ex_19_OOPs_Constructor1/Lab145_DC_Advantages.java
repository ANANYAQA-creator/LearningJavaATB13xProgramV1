package ex_19_OOPs_Constructor1;

public class Lab145_DC_Advantages {
    public static void main(String[] args) {

        Car c1= new Car();
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.Model);

        Car c2 = new Car();
        c2.name = "Audi";
        System.out.println(c2.name);

    }

}
class Car{

    String name;
    int year;
    String Model;

    //DC
    Car(){

        name = "Kiwd";
        year = 2000;
        Model = "Climber";
    }
}