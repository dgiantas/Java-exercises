
package bunnyapplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class BunnyApplication {

    public static void main(String[] args) {
        
        
        Bunny bunny1 = new Bunny(10);
        Bunny bunny2 = new Bunny(14);
        Bunny bunny3 = new Bunny(20);
        
        
        List <Bunny> listOfBunnies = new ArrayList();
        listOfBunnies.add(bunny1);
        listOfBunnies.add(bunny2);
        listOfBunnies.add(bunny3);
        for (int i =0; i<listOfBunnies.size(); i++){
            Bunny temp = listOfBunnies.get(i);
            System.out.println(temp);
            temp.hop();
        }
        
        Iterator <Bunny> iterator = listOfBunnies.iterator();
        while (iterator.hasNext()){
            Bunny tempBunny = iterator.next();
            tempBunny.hop();
        }
        System.out.println();
        
        
        
        Map <Bunny, Integer > mapOfBunnies = new TreeMap();
        
        mapOfBunnies.put(bunny1,10);
        mapOfBunnies.put(bunny2, 14);
        mapOfBunnies.put(bunny3, 20);
        
        
        for (Bunny temp : mapOfBunnies.keySet()){
            System.out.println("key: " + temp); 
        }
            
       for (Map.Entry<Bunny,Integer> entry: mapOfBunnies.entrySet()){
           System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        }
        
    }
    
}
