package ex_31_Exception;

public class Lab203_Custom_Exception {
    public static void main(String[] args) throws CurrencyMismatchCustomException {

        Bank_CustomException_203 ICICI = new Bank_CustomException_203("INR", 200);
        Bank_CustomException_203 SBI = new Bank_CustomException_203("INR",500);

        int total = SBI.add(ICICI);
        System.out.println(total); //800

        Bank_CustomException_203 JP_chase = new Bank_CustomException_203("USD",100);
        int total1 = SBI.add(JP_chase);
        System.out.println(total1);

    }
}
