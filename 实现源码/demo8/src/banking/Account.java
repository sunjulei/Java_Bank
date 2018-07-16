package banking;

import banking.domain.OverdraftException;

/**
 * Created by Administrator on 2018/7/16 0016.
 */
public class Account {

    protected double balance;

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

    public void withdraw(double amt) throws OverdraftException {
        if (amt < balance) balance -= amt;
        else throw new OverdraftException("资金不足",(amt-balance));

    }
}