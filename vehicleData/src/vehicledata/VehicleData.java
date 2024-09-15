package vehicledata;

import java.util.Scanner;

public class VehicleData {

    public static void main(String[] args) {
        ReturnVehicleData vehicle = new ReturnVehicleData();
        // variable referencing the previous object = new instance and its constructor method
        String licensePlate;
        int year;
        float price;
        
        Scanner input = new Scanner(System.in);
        
        do {    
            System.out.print("Enter your car's license plate: ");
            licensePlate = input.next();
            
            if (licensePlate.length() != 7) {
                System.out.println("\nInvalid number of characters!\n\nPlease try again!\n");
            }
            
        } while(licensePlate.length() > 7);
        
        vehicle.setLicensePlate(licensePlate.toUpperCase());
        
        do {
            System.out.print("Enter your car's year: ");
            year = input.nextInt();
            
            if (String.valueOf(year).length() != 4) {
                System.out.println("\nThe year must have 4 digits!\n");
            }
        } while(String.valueOf(year).length() != 4);
        
        vehicle.setYear(year);
        
        System.out.print("Enter your car's price: ");
        price = input.nextFloat();
        vehicle.setPrice(price);
        
        System.out.println("\nThe information about your car is:\n\nLICENSE PLATE: "+vehicle.getLicensePlate()+" | YEAR: "+vehicle.getYear()+" | PRICE: "+vehicle.getPrice()+"\n");
    }
    
}