
package recapdogex;


public class Dog {

    public Dog(int dogNumber) {
        this.dogNumber = dogNumber;
    }
    
   private int dogNumber;
   public void bark(){
            System.out.println("The dog with the number : " +dogNumber + " is barking");
        }
    
}
