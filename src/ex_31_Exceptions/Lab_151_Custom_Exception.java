package ex_31_Exceptions;

public class Lab_151_Custom_Exception {
    public static void main(String[] args) throws CurrencyMismatchException {
        Bank sbi = new Bank("INR",500);
        Bank icici = new Bank("INR",123);

        int total = sbi.add(icici);
        System.out.println(total);

        Bank jp = new Bank("USD",100);
        int t2 = icici.add(jp);
        System.out.println(t2);


    }
}
