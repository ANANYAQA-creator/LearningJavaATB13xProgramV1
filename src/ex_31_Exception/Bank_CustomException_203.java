package ex_31_Exception;

public class Bank_CustomException_203 {
    private String currency;
    private Integer amount;

    //Getter Setter

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    // Parameterised Constructor

    public Bank_CustomException_203(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Integer add(Bank_CustomException_203 BankName) throws CurrencyMismatchCustomException {
        if (BankName.currency.equals("INR")) {
            return BankName.amount + this.amount;
        } else {
            throw new CurrencyMismatchCustomException ("Currency Mismatch");
        }
    }
}
    class CurrencyMismatchCustomException extends  Exception{
        public CurrencyMismatchCustomException(String message) {
            super(message);
        }
    }

    class  NotValidAgeException extends Exception{
        public NotValidAgeException(String message1) {
            super(message1);

        }
    }


