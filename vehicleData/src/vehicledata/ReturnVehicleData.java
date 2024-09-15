package vehicledata;

public class ReturnVehicleData {
    private String licensePlate;
    private int year;
    private float price;
    
    public String getLicensePlate() {
        return licensePlate;
    }
    
    public int getYear() {
        return year;
    }
    
    public float getPrice() {
        return price;
    }
    
    // class with a 'void' method does not return any value
    
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
}
