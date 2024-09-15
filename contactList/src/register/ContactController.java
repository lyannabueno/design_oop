package register;

import java.util.ArrayList;

public class ContactController { 
    // visibility level of a class
    
    private ArrayList<Contact> contacts; 
    // visibility level of a method or attribute
    
    public ContactController(){ 
        // constructor method creates a new instance of a class and initializes the object (has the same name as the class and does not define a return type)
        contacts = new ArrayList<Contact>();
    }
    
    public void addContact(Contact contact){
        contacts.add(contact);
    }
    
    public void removeContact(Contact contact){
        contacts.remove(contact);
    }
    
    public Contact findContactByName(String name){
        Contact contact = null;
        
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)){
                contact = contacts.get(i);
                break;
            }
        }
        
        return contact;
    }
        
    public ArrayList<Contact> getContacts(){
        return contacts;
    }
}
