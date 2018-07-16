package banking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2018/7/16 0016.
 */
public class Customer {

    private String firstName;
    private String lastName;
    private List<Account> account;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
        this.account=new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public void addAccount(Account account){
        this.account.add(account);
    }

    public Account getAccount(int index){
        return (Account) this.account.get(index);
    }

    public int getNumOfAccounts(){
        return account.size();
    }

    public Iterator<Account> getAccounts(){
        return account.iterator();
    }
}