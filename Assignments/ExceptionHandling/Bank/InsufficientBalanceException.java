package bank;

public class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(){
        super("The amount is more than than your balance");
    }
}
