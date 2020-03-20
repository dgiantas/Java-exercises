
package playingemployees;

public class Receptionist extends Employee implements Driving {
    
    public void greet (){
        System.out.println( getName() + "Receptionist is greeting ");
    }

    public Receptionist(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void drive() {
       System.out.println(getName () + "Receptionist is driving");
    }

    @Override
    public void work() {
       greet();
    }
}
