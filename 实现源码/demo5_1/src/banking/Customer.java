package banking;

/**
 * Created by Administrator on 2018/7/16 0016.
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Account[] account;
    private int numOfAccounts;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        this.account=new Account[5];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public void addAccount(Account account){
        this.account[numOfAccounts]=account;
        numOfAccounts++;
    }

    public Account getAccount(int index){
        return this.account[index];
    }

    public int getNumOfAccounts(){
        return numOfAccounts;
    }
}