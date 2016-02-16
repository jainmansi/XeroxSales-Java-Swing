/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;
    
    
    public CustomerDirectory(){
        customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
       
    public Customer addCustomer(){
        Customer c = new Customer();
        customerList.add(c);
        return c;
    }
    
    public void removeCustomer(Customer c){
        customerList.remove(c);
    }
}
