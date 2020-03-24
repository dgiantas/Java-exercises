package mypackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class StringUtil {

    public static void playWithNames() {
        ArrayList<String> names = new ArrayList();
        names.add("Nick");
        names.add("Jack");
        names.add("Mary");
        names.add("Andy");

        LinkedList<String> linkedListNames = new LinkedList();
        linkedListNames.add("Jack");
        linkedListNames.add("John");
        linkedListNames.addFirst("Mary");
        for (String name : linkedListNames) {
            System.out.print(name + ",");
        }

    }
    Student s1 = new Student("Nick", 15, 70);
    Student s2 = new Student("Nick", 15, 70);
    Student s3 = new Student("Mary", 18, 85);
    Student s4 = new Student("James", 17, 70);

    public void listOfStudentContains() {
        List<Student> list = new ArrayList();
        list.add(s1);
        System.out.println("list.contains(s1):" + list.contains(s1));
        System.out.println("list.contains(s2):" + list.contains(s2));
        System.out.println("list.contains(s3):" + list.contains(s3));

    }

   

    public void printingSetOfStudents() {
        Set<Student> setOfStudents = new LinkedHashSet();

        for (Student student : setOfStudents) {
            System.out.println(student);

        }
    }

  
    }


