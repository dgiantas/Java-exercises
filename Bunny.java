/*
Create a class called Bunny with an int bunnyNumberinitialized in the constructor. 
• Give it a method called hop() that prints out which gerbil number this is, and that it’s hopping. 
• Create an ArrayListand add 5 Bunny objects to  the List. 
• Now use the get() method to move  through the List and call hop() for each Bunny. 
• Loop through the ArrayListusing an Iterator 
 */
package bunnyapplication;

/**
 *
 * @author user
 */
public class Bunny {
    
    private int bunnyNumber;

    public int getBunnyNumber() {
        return bunnyNumber;
    }
    

    public Bunny(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }
    
   public void hop(){
   System.out.println("Hello I am hopping. And this is my bunny number:"+bunnyNumber);
 
   }
   
}
