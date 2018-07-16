package banking.domain;

import banking.Customer;

/**
 * Created by Administrator on 2018/7/16 0016.
 */
public class Bank {

    //Customer对象的数组
    private Customer[] customers;

    //跟踪下一个 customers数组索引
    private int numberOfCustomer;

    //私有构造器，以合适的最大尺寸（至少大于5）初始化 customers数组。
    private Bank() {
        customers = new Customer[5];
    }

    //依照参数（姓，名）构造一个新的Customer对象然后把它放到customer数组中。
    // 再把numberofCustomer属性的值加 1。
    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f, l);
        customers[numberOfCustomer] = customer;
        numberOfCustomer++;
    }

    //返回 numberOfCustomer属性值。
    public int getNumOfCustomers() {
        return numberOfCustomer;
    }

    //返回与给出的index参数相关的客户
    public Customer getCustomer(int index){
        return customers[index];
    }

    private static Bank bankInstance=new Bank();

    public static Bank getBank(){
        return bankInstance;
    }



}