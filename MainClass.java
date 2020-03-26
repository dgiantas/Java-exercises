

/*Write an application named UseDivision
that creates InternationalDivision and DomesticDivision objects for two different companies 
and displays information about them. */


package mypackage;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
   
       InternationalDivision international1 = new InternationalDivision("Venesuela", "spanish", "Vectron", 20000);
       InternationalDivision international2 = new InternationalDivision("USA", "English", "Vectron" ,3020200);
       InternationalDivision international3 = new InternationalDivision("Estonia", "Estonian", "CyberNetica", 45687);
       InternationalDivision international4 = new InternationalDivision("Finland", "Finnish", "CyberNetica", 12000);
       DomesticDivision domestic1 = new DomesticDivision("Attica", "Kritikos", 1289000);
       DomesticDivision domestic2 = new DomesticDivision("Attica", "Vectron", 998088);
       DomesticDivision domestic3 = new DomesticDivision("Kilkis", "Kritikos", 134567);
       DomesticDivision domestic4 = new DomesticDivision("Irakleio", "Kritikos", 23099);
       DomesticDivision domestic5 = new DomesticDivision("Zakynthos", "Kritikos", 445670);
       
       List <InternationalDivision> listOfInternational = new ArrayList();
       listOfInternational.add(international1);      
       listOfInternational.add(international2);  
       listOfInternational.add(international3);  
       listOfInternational.add(international4);  
       for (InternationalDivision international:listOfInternational){
           international.display();
       }
       
       List<DomesticDivision> listOfDomestic = new ArrayList();
       listOfDomestic.add(domestic1);
       listOfDomestic.add(domestic2);
       listOfDomestic.add(domestic3);
       listOfDomestic.add(domestic4);
       listOfDomestic.add(domestic5);
       for (DomesticDivision domestic:listOfDomestic){
           domestic.display();
       }
    
   
      }
    
      
      
    }
    

