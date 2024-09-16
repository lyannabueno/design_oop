package inheritanceperson;

public class Person {
   private String name;
   private String phone;
   private String email;
    
    public String getName() {
        return this.name;
    }
    
    public String getPhone() {
        return this.phone;
    }
    
    public String getEmail() {
        return this.email;
    }

    public void updateName(String name) {
        this.name = name;
    }
    
    public void updatePhone(String phone) {
        this.phone = phone;
    }
    
    public void updateEmail(String email) {
        this.email = email;
    }
}
