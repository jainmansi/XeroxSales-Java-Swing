/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

public class Supplier extends Person {

    private String supplyName;
    private int supplierId;
    private ProductCatalog productCatalog;
    private static int count = 0;

    public Supplier() {
        productCatalog = new ProductCatalog();
        count++;
        supplierId = count;
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public String toString() {
        return this.getFname(); //To change body of generated methods, choose Tools | Templates.
    }

}
