package automotivepolymorphism;

public class AutomotivePolymorphism {

    public static void main(String[] args) {
        Automotive automotive = new Automotive();
        System.out.println(automotive.getType());
        
        AutomotivePassenger automotivePassenger = new AutomotivePassenger();
        System.out.println(automotivePassenger.getType());
        
        AutomotiveCargo automotiveCargo = new AutomotiveCargo();
        System.out.println(automotiveCargo.getType());
        
        Automotive automotive2 = new AutomotivePassenger();
        System.out.println(automotive2.getType());
        
        Automotive automotive3 = new AutomotiveCargo();
        System.out.println(automotive3.getType());
    }
    
}
