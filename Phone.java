
package mypackage;


public abstract class Phone {
    
    private String brand;
    private double price;

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public Phone(String brand) {
        this.brand = brand;
    }
    
    
}
