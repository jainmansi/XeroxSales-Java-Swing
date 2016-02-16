/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

public class SalesPerson extends Person implements Comparable<SalesPerson>{
    
    private static int count = 0;
    private int salesId;
    private float commission;
    private int saleVol;
    private int aboveTarget;
    private int belowTarget;

    public SalesPerson(){
        count++;
        salesId = count;
    }
    
    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public int getAboveTarget() {
        return aboveTarget;
    }

    public void setAboveTarget(int aboveTarget) {
        this.aboveTarget = aboveTarget;
    }

    public int getBelowTarget() {
        return belowTarget;
    }

    public void setBelowTarget(int belowTarget) {
        this.belowTarget = belowTarget;
    }
    
    @Override
    public String toString() {
        return this.getFname();
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }
    
    

    public int getSaleVol() {
        return saleVol;
    }

    public void setSaleVol(int saleVol) {
        this.saleVol = saleVol;
    }

    

    @Override
    public int compareTo(SalesPerson sp) {
        int compareSaleVol = ((SalesPerson)sp).getSaleVol();
        return compareSaleVol - this.saleVol;
    }
    
    
           
}
