
package recapdogex;

import java.util.ArrayList;
import java.util.Iterator;

public class RecapDogEx {

    
    public static void main(String[] args) {
        
     
        Dog dog1 = new Dog(1);
        dog1.bark();
        
        ArrayList <Dog> listOfDogs = new ArrayList ();
        listOfDogs.add(dog1);
        listOfDogs.add(new Dog(2));
        listOfDogs.add(new Dog(3));
        listOfDogs.add(new Dog(4));
        listOfDogs.add(new Dog(5));
        listOfDogs.add(new Dog(6));
        listOfDogs.add(new Dog(7));
        listOfDogs.add(new Dog(8));
        listOfDogs.add(new Dog(9));
        listOfDogs.add(new Dog(10));
        
        for (int i =0; i<listOfDogs.size(); i++){
            Dog temp = listOfDogs.get(i);
            System.out.println(temp);
            temp.bark();
       
       Iterator <Dog> iterator = listOfDogs.iterator();
       while (iterator.hasNext()){
            Dog tempDog = iterator.next();
            tempDog.bark();
        }
        System.out.println();
    }

}
}
    

