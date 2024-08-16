package bank;

public class Users {
    private String name;
    private int balance;
    Users(String name,int balance){
        this.name=name;
        this.balance=balance;
    }
    void withdraw(int amount){
        try{
            if(amount>balance)
                throw new InsufficientBalanceException();
            System.out.println(amount+" is withdrawn successfully");
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());

        }
    }
}
