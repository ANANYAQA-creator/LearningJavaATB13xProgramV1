package ex_22_OOPs_Encapsulation;

public class RealBank_Example {
    public static void main(String[] args) {

        HSBCBank Shiv = new HSBCBank("Shiv",56456l);
           //     long balance = Shiv.balance;
              long balance = Shiv.getBalance();
        System.out.println(balance);
        Shiv.setBalance(500, true);
        long balance2 = Shiv.getBalance();
        System.out.println(balance2);

    }
}

class HSBCBank {

    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long balance;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isCashier) {
        if (isCashier) {
            this.balance = balance;
        } else {
            System.out.println("Not allowed to change the Bal");
        }

        this.balance = balance;
    }

    public HSBCBank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }
}