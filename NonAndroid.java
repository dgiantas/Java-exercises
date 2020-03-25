
package mypackage;


public class NonAndroid extends Phone {
    
    static double nonAndroidPrice = 37.99;

    @Override
    public double getPrice() {
        return nonAndroidPrice;
    }

    public NonAndroid(String brand) {
        super(brand);
    }
    
    public NonAndroid(String brand, double price){
    super(brand);
    this.nonAndroidPrice = price;
}
    

    
    
}
