package Business;

import java.util.ArrayList;

public class Order {

    private static int count = 0;
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    private SalesPerson salesPerson;
    private Customer customer;
    private float salesPersonCommission;
    
    public Order() {
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<>();
    }
    
    public int getOrderNumber() {
        return orderNumber;
    }
    
    public void removeOrderItem(OrderItem o) {
        orderItemList.remove(o);
    }
    
    public OrderItem addOrderItem(Product p, int q, int price) {
        OrderItem o = new OrderItem();
        o.setProduct(p);
        o.setQuantity(q);
        o.setSalesPrice(price);
        orderItemList.add(o);
        return o;
    }

    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
            
    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }
    
    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public float getSalesPersonCommission() {
        return salesPersonCommission;
    }

    public void setSalesPersonCommission(float salesPersonCommission) {
        this.salesPersonCommission = salesPersonCommission;
    }  
    
    public int getOrderTotal(){
        int sum = 0;
        for(OrderItem oi : orderItemList){
            sum += oi.getOrderItemTotal();
        }
        return sum;
    }
    
    public int getSalesVolume(){
        int salesVolume = 0;
        for(OrderItem oi : orderItemList){
            salesVolume += oi.getQuantity();
        }
        return salesVolume;
    }
}
