package inheritanceperson;

public class InheritancePerson {

    public static void main(String[] args) { 
        NaturalPerson individualPerson = new NaturalPerson();
        individualPerson.updateName("Individual Person");
        individualPerson.updatePhone("21-7777-4321");
        individualPerson.updateEmail("individualPersonEmail@hotmail.com");
        individualPerson.updateCPF("111.111.111-11");

        System.out.println("Name: " + individualPerson.getName());
        System.out.println("Phone: " + individualPerson.getPhone());
        System.out.println("Email: " + individualPerson.getEmail());
        System.out.println("CPF: " + individualPerson.getCPF());
        
        LegalEntity legalEntity = new LegalEntity();
        legalEntity.updateName("Legal Entity");
        legalEntity.updatePhone("21-9999-4321");
        legalEntity.updateEmail("legalEntityEmail@hotmail.com");
        legalEntity.updateCNPJ("11.111.111/0001-11");

        System.out.println("\nName: " + legalEntity.getName());
        System.out.println("Phone: " + legalEntity.getPhone());
        System.out.println("Email: " + legalEntity.getEmail());
        System.out.println("CNPJ: " + legalEntity.getCNPJ());
    }
}
