/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

public class Product implements Comparable<Product>{
    
    private String prodName;
    private int price;
    private int modelNumber;
    private int avail;
    private int floorPrice;
    private int ceilPrice;
    private int targetPrice;
    private int salesVolm;
    
    private static int count =0;

    @Override
    public String toString() {
        return prodName; //To change body of generated methods, choose Tools | Templates.
    }

     public int getAvail() {
        return avail;
    }
    
    public void setAvail(int avail) {
        this.avail = avail;
    }
    
    public Product() {
    count++;
    modelNumber = count;
    }

    public int getFloorPrice() {
        return floorPrice;
    }

    public void setFloorPrice(int floorPrice) {
        this.floorPrice = floorPrice;
    }

    public int getCeilPrice() {
        return ceilPrice;
    }

    public void setCeilPrice(int ceilPrice) {
        this.ceilPrice = ceilPrice;
    }

    public int getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(int targetPrice) {
        this.targetPrice = targetPrice;
    } 
    
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getSalesVolm() {
        return salesVolm;
    }

    public void setSalesVolm(int salesVolm) {
        this.salesVolm = salesVolm;
    }
    

    @Override
    public int compareTo(Product prod) {
        int compareSaleVol = ((Product)prod).getSalesVolm();
        return compareSaleVol - this.salesVolm;
    }
    
    
    
}
