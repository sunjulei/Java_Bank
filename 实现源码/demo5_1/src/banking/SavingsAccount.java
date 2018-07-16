package banking;

/**
 * Created by Administrator on 2018/7/16 0016.
 */
public class SavingsAccount extends Account{
    private double interestRate;


    public SavingsAccount(double balance,double interest_rate) {
        super(balance);
        this.interestRate=interest_rate;
    }
}