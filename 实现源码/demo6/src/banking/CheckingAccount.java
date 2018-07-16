package banking;

/**
 * Created by Administrator on 2018/7/16 0016.
 */
public class CheckingAccount extends Account {

    private double overdraftProtection;



    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftProtection = protect;
    }

    @Override
    public boolean withdraw(double amt) {

        if (balance>=amt){
            //余额足够
            balance-=amt;
        }else if(overdraftProtection+balance>=amt){
            //余额不够，但加上透支足够
            overdraftProtection-=amt-balance;
            balance=0;
        }else {
            //余额和透支都不足
            return false;
        }
        return true;
    }
}