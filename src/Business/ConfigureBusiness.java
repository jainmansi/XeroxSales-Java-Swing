/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

public class ConfigureBusiness {
    
    public static Business InitializeBusiness(){
        Business business = Business.getInstance();
        SalesPerson salesPerson = business.getSalesPersonDirectory().addSalesPerson();
        salesPerson.setFname("Admin");
        salesPerson.setLname("Admin");
        salesPerson.setContact(1111);
        salesPerson.setEmail("admin@xerox.com");
        
        
        UserAccount ua = business.getUserAccountDirectory().addUserAccount();
        ua.setUserName("admin");
        ua.setPassword("admin");
        ua.setIs_Active("YES");
        ua.setRole(UserAccount.ADMIN);
        ua.setPerson(salesPerson);
        
        return business;
    }
    
}
