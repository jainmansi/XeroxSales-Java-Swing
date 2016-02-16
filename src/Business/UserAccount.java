/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author user
 */
public class UserAccount {
    
    public static final String ADMIN = "admin";
    public static final String SALESPERSON = "salesperson";
    public static final String SUPPLIER = "supplier";
    private String role;
    private String is_Active;
    private String userName;
    private String password;
    private Person person;
    private int userAccountId;
    private static int count = 0;
    
    public UserAccount(){
        count++;
        userAccountId = count;
                
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIs_Active() {
        return is_Active;
    }

    public void setIs_Active(String is_Active) {
        this.is_Active = is_Active;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(int userAccountId) {
        this.userAccountId = userAccountId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    @Override
    public String toString() {
        return this.getPerson().getFname();
    }
    
    
    
    
}
