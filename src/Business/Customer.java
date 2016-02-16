/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


public class Customer extends Person implements Comparable<Customer>{
    private static int count = 0;
    private int customerId;
    private int purchaseVolume;
    
    public Customer(){
        count++;
        customerId = count;
    }

    public static void setCount(int count) {
        Customer.count = count;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return this.getFname();
    }

    public int getPurchaseVolume() {
        return purchaseVolume;
    }

    public void setPurchaseVolume(int purchaseVolume) {
        this.purchaseVolume = purchaseVolume;
    }
    
    @Override
    public int compareTo(Customer c) {
        int comparePurchaseVolume = ((Customer)c).getPurchaseVolume();
        return comparePurchaseVolume - this.purchaseVolume;
    }    
    
}
