package banking.reports;

import banking.Account;
import banking.CheckingAccount;
import banking.Customer;
import banking.SavingsAccount;
import banking.domain.Bank;

import java.util.Iterator;

/**
 * Created by Administrator on 2018/7/16 0016.
 */
public class CustomerReport {
    public void generateReport() {

        Customer customer = null;
        Bank bank = Bank.getBank();
        // Generate a report
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");


        Iterator<Customer> customerIterator = bank.getCustomers();


        while (customerIterator.hasNext()) {
            customer = customerIterator.next();
//        for (int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++) {
//            customer = bank.getCustomer(cust_idx);

            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());

            Iterator<Account> accountIterator = customer.getAccounts();
            while (accountIterator.hasNext()) {
//            for (int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++) {
//                Account account = customer.getAccount(acct_idx);
                String account_type = "";
                Account account=accountIterator.next();
                // Determine the account type
                /*** Step 1:
                 **** Use the instanceof operator to test what type of account
                 **** we have and set account_type to an appropriate value, such
                 **** as "Savings Account" or "Checking Account".
                 ***/
                if (account instanceof SavingsAccount) account_type = "Savings Account";
                else if (account instanceof CheckingAccount) account_type = "Checking Account";

                // Print the current balance of the account
                /*** Step 2:
                 **** Print out the type of account and the balance.
                 **** Feel free to use the currency_format formatter
                 **** to generate a "currency string" for the balance.
                 ***/
                System.out.println(account_type + ":current balance is ￥" + account.getBalance());
            }
        }
    }
}