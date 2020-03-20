
package playingemployees;


public class Teacher extends Employee implements Advisable {
    
    public void teach (){
        System.out.println( getName() + "Teacher is teaching");
    }

    public Teacher(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void giveAdvice() {
        System.out.println(getName () + "Teacher is giving advice");
    }

    @Override
    public void work() {
         teach();
    }

   
}
