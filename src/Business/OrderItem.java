package Business;


public class OrderItem {

    private Product product;
    private int quantity;
    private int salesPrice;
    
    private int total = quantity * salesPrice;
    
    public Product getProduct() {
        return product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
        
    public int getSalesPrice() {
        return salesPrice;
    }
    
    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }
    
    @Override
    public String toString() {
        return product.getProdName();
    }
    
    public int getOrderItemTotal(){
        return quantity * salesPrice;
    }
    
}
