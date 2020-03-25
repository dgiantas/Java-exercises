/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

/**
 *
 * @author user
 */
public class Android extends Phone {
    
    static double androidPrice = 24.99;

    public Android(String brand) {
        super(brand);
    }
    
public Android(String brand, double price){
    super(brand);
    this.androidPrice = price;
}



    

    public static void setAndroidPrice(double androidPrice) {
 Android.androidPrice = androidPrice;
 
 
 
     
 }

    @Override
    public double getPrice() {
        return androidPrice;
    }
}
    
