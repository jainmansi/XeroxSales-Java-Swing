package Business;

public class Business {
    
    private static Business business;
    private MasterOrderCatalog masterOrderCatalog;
    private SalesPersonDirectory salesPersonDirectory;
    private CustomerDirectory customerDirectory;
    private SupplierDirectory supplierDirectory;
    private UserAccountDirectory userAccountDirectory;
    
    private Business() {
        masterOrderCatalog = new MasterOrderCatalog();
        salesPersonDirectory = new SalesPersonDirectory();
        customerDirectory = new CustomerDirectory();
        userAccountDirectory = new UserAccountDirectory();
        supplierDirectory = new SupplierDirectory();
    }
    
    public static Business getInstance(){
        if(business == null){
            business = new Business();
        }
        return business;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }
    
    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public static Business getBusiness() {
        return business;
    }

    public static void setBusiness(Business business) {
        Business.business = business;
    }

    public SalesPersonDirectory getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public void setSalesPersonDirectory(SalesPersonDirectory salesPersonDirectory) {
        this.salesPersonDirectory = salesPersonDirectory;
    }
    
    
}
