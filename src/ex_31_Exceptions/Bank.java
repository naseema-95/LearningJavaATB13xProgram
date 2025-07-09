package ex_31_Exceptions;

public class Bank {
    private String currency;
    private int amount;

    public Bank(String curr, int amt){
        this.currency=curr;
        this.amount=amt;
    }

    public String getCurrency(){
        return currency;
    }
    public int getAmount(){
        return amount;
    }
    public void setCurrency(String cur){
        this.currency=cur;
    }
    public void setAmount(int amnt){
        this.amount=amnt;
    }

    public int add(Bank bankName) throws CurrencyMismatchException{
        if(bankName.currency.equals("INR")){
            return bankName.amount+this.amount;
        }else{
            throw new CurrencyMismatchException("Currency Mismatch");
        }
    }

}
class CurrencyMismatchException extends Exception{
    public CurrencyMismatchException(String msg){
        super(msg);
    }
}
