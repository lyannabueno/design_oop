package register;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactInterface {
    private Scanner scanner;
    private ContactController contactController;
    
    public ContactInterface(){
        scanner = new Scanner(System.in);
        contactController = new ContactController();
    }
    
    private int getOption() {
        System.out.println("\n1. Add");
        System.out.println("2. Find");
        System.out.println("3. Remove");
        System.out.println("4. List");
        System.out.println("0. Exit");
        System.out.print("\nOption: ");
        return scanner.nextInt();
    }

    private void addContact() {
        String name;
        String phone;
        String email;
        
        scanner.nextLine(); // Consume the leftover newline character
        
        System.out.print("\nName: ");
        name = scanner.nextLine();
        System.out.print("Phone: ");
        phone = scanner.next();
        System.out.print("Email: ");
        email = scanner.next();
        
        Contact contact = new Contact(name, phone, email);
        contactController.addContact(contact);
    }
    
    private void findContact() {
        String name;
        
        scanner.nextLine(); // Consume the leftover newline character
        
        System.out.print("\nEnter the name: ");
        name = scanner.nextLine();
        
        Contact contact = contactController.findContactByName(name);
        
        if (contact != null){
            System.out.println("\nContact found:\n"+
            "\nName: "+contact.getName()+"\n"+
            "Phone: "+contact.getPhone()+"\n"+
            "Email: "+contact.getEmail());
        } else {
            System.out.println("\nContact not found");
        }
    }
    
    private void removeContact() {
        String name;
        
        scanner.nextLine(); // Consume the leftover newline character
        
        System.out.print("\nEnter the name: ");
        name = scanner.nextLine();
        
        Contact contact = contactController.findContactByName(name);
        
        if (contact != null){
            contactController.removeContact(contact);
            System.out.println("\nContact removed");
        } else {
            System.out.println("\nContact not found");
        }
    }
    
    private void listContacts() {
        ArrayList<Contact> contacts = contactController.getContacts();
        
        if (contacts.isEmpty()) {
            System.out.println("\nThe contact list is empty");
        } else {
            for (Contact contact : contacts){
                System.out.println("\nName: "+contact.getName()+
                " Phone: "+contact.getPhone()+
                " Email: "+ contact.getEmail());
            }
        }
    }
    
    public void run() {
        int option = 0;
        
        do {
            option = getOption();
            switch (option){
                case 1: addContact();
                    break;
                case 2: findContact();
                    break;
                case 3: removeContact();
                    break;
                case 4: listContacts();
                    break;
                case 0: System.out.println("Exiting...");
                    break;
                default: System.out.println("Invalid option. Please try again.");
            }
        } while (option != 0);
    }
}
