
package Model;

public class User {
    private int id;
    private String name;
    private String nic;
    private String mobile;
    private String email;
    private UserType userType;
    
    public User(){}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }  
    
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }  
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }  
    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
