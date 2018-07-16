package banking;

/**
 * Created by Administrator on 2018/7/16 0016.
 */
public class Account {

    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amt) {
        balance += amt;
        return true;
    }

    public boolean withdraw(double amt) {
        if (amt < balance) {
            balance -= amt;
            return true;
        }
        return false;
    }
}