package ex_30_WrapperClass;

//Below, the class contains all the things which are interface objects,
// classes, constructors, parameterized constructors,
// default constructors, enums, wrapper classes, method overloading,
// and method overriding.

public class Lab182_Wrapper_Class_Ex {
    public static void main(String[] args) {

        newMobilePhone iphone = new newMobilePhone(1, "iphone 16",120000.00);
        newMobilePhone samsung = new newMobilePhone(2, "ultra 24",1350000.00);

        iphone.setPrice(200000.89);
        iphone.display();
        samsung.display();

        System.out.println(newMobilePhone.Mobile_Operator);
        newMobilePhone.switchOnAeroplaneMode();

        System.out.println(Covers.red.getColor());
    }
}


class newMobilePhone extends OldPhone {   // Single inheritance

    private String Name;    // ENCAPSULATION
    private Integer number;
    private Double price;
    static String Mobile_Operator = "JIO";

    //GETTER SETTERS
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

//DEFAULT CONSTRUCTOR

    newMobilePhone() {
        System.out.println("Default Constructor");
    }

    // DEFAULT CONSTRUCTOR

    public newMobilePhone(Integer number,String Name,Double price){
        this.Name = Name;
        this.number = number;
        this.price= price;
    }

    // NON STATIC FUNCTION
    void display(){
        System.out.println(this.Name + this.number + this.price);
    }

    // Static Function

    static  void switchOnAeroplaneMode() {
        System.out.println("Common Aeroplane mode");
    }

    // Method OverLoading   - same name but different parameters
    void priceChange(Integer price){
        System.out.println("Change price in Integers");
    }

    void priceChange(Double price){
        System.out.println("Change price in decimals");
    }


    @Override // father overriding
    void calling (){
        System.out.println("Calling via touch dialpad now");
    }
}

class OldPhone implements SIMCard{

    void calling(){
        System.out.println("Calling via DialPad");
    }


    // Method OverRiding

    @Override
    public void EnterCard() {
        System.out.println("Card Entered");
    }
}

// ENUM

enum Covers {

        red("red_cover"),
        blue("blue_cover");

        private String color;
        Covers(String color) {
            this.color = color;
        }

        String getColor() {
            return this.color;
        }

    }

    // Abstraction
    interface SIMCard {
        void EnterCard();
    }
