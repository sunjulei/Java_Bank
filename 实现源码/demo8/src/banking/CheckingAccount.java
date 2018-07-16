package banking;

import banking.domain.OverdraftException;

/**
 * Created by Administrator on 2018/7/16 0016.
 */
public class CheckingAccount extends Account {

    private double overdraftProtection;
//    private boolean isProtect;


    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftProtection = protect;
    }

    @Override
    public void withdraw(double amt) throws OverdraftException {
        /*if (balance>=amt){
            //余额足够
            balance-=amt;
        }        else if(overdraftProtection+balance>=amt){
            //余额不够，但加上透支足够
            overdraftProtection-=amt-balance;
            balance=0;
        }else {
            //余额和透支都不足
        }*/

        if (balance >= amt) {
            //余额足够
            balance -= amt;
        } else {
            if (overdraftProtection>0) {
                //允许透支
                if (overdraftProtection + balance >= amt) {
                    //足够钱透支
                    overdraftProtection -= amt - balance;
                    balance = 0;
                }else {
                    //透支的数额超限
                    throw new OverdraftException("Insufficient funds for overdraft protection",(amt-balance));
                }
            } else {
                //不支持透支
                throw new OverdraftException("no overdraft protection",(amt-balance));
            }
        }
    }
}