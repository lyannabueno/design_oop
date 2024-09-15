package register;

public class Contact {
    private String name;
    private String phone;
    private String email;
    
    public Contact(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getEmail(){
        return email;
    }
    
    // Class with 'void' method does not return any value
    
    public void updateName(String name){
        this.name = name;
    }
    
    public void updatePhone(String phone){
        this.phone = phone;
    }
    
    public void updateEmail(String email){
        this.email = email;
    }
}
