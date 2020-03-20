/*
1. Create class Employee with name and salary.
2. Create subclasses Teacher, Receptionist, Director
3. Teacher teach(), Receptionist greet(), Director guide()
4. Interfaces Advisable, Driving
5. Advisable has method giveAdvice(), Driving has method drive().
6. Teacher-->Advisable, Receptionist-->Driving, Director-->both.
7. Create 2 Teachers, 1 Receptionist, 2 Director. Put them in a list.
7a. Add abstract method work() in Employee.
7b. Each work() method will call the special method each Subclass has.
7c. Ask each employee to work().
8. Separate those that can drive from those that can advice.: LIST


 */
package playingemployees;

import java.util.ArrayList;
import java.util.List;

public class PlayingEmployees {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Nick", 1000);
        Teacher teacher2 = new Teacher("Mary", 800);
        Receptionist receptionist = new Receptionist("Peter", 1200);
        Director director1 = new Director("Andy", 2000);
        Director director2 = new Director("Jonathan", 2500);

        List<Employee> employeeList = new ArrayList();
        employeeList.add(teacher1);
        employeeList.add(teacher2);
        employeeList.add(director1);
        employeeList.add(director2);
        employeeList.add(receptionist);

        for (Employee employee : employeeList) {
            employee.work();
        }

        List<Advisers> advisers = new ArrayList();
        List<Driving> drivers = new ArrayList();

        for (Employee employee:employeeList){
           if(employee instanceof Advisable){
               advisers.add((Advisable)employee);
               System.out.println(employee.getName() + " is an advisor.");
          
           if(employee instanceof Driving){
               drivers.add((Driving)employee);
              System.out.println(employee.getName() + " is a driver.") }
           }
        
        for (Driving driver : drivers) {
            System.out.print("The list of the drivers is " + drivers);
        }
        for (Advisable advisor : advisers) {
            System.out.println("The list of the advisers is " +advisers);
       }
    }

}
