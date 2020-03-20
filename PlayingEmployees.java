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

        List<Advisable> advisers = new ArrayList();
        List<Driving> drivers = new ArrayList();

        boolean isAdvisable1 = (teacher1 instanceof Advisable);
        boolean isAdvisable2 = teacher2 instanceof Advisable;
        boolean isAdvisable3 = director1 instanceof Advisable;
        boolean isAdvisable4 = director2 instanceof Advisable;
        boolean isAdvisable5 = receptionist instanceof Advisable;
        boolean isDriving1 = teacher1 instanceof Driving;
        boolean isDriving2 = teacher2 instanceof Driving;
        boolean isDriving3 = director1 instanceof Driving;
        boolean isDriving4 = director1 instanceof Driving;
        boolean isDriving5 = receptionist instanceof Driving;

        advisers.add(teacher1);
        advisers.add(teacher2);
        advisers.add(director1);
        advisers.add(director2);
        drivers.add(director2);
        drivers.add(director1);
        drivers.add(receptionist);

        for (Driving driver : drivers) {
            System.out.print("The list of the drivers is " + drivers);
        }
        for (Advisable advisor : advisers) {
            System.out.println("The list of the advisers is " +advisers);
        }
    }

}
