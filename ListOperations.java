
package mypackage;

import java.util.ArrayList;
import java.util.List;


public class ListOperations {
    private List<String> names;
    
    public void addNameToList(String name){
        if (name == null){
            names = new ArrayList();
        }
        names.add(name);
        
    }

    public List<String> getNames() {
        return names;
    }
    public void removeNameFromList(String name){
        names.remove(name);
          
        
    }
    
    public int getSizeOfList(){
        return names.size();
    }
}
