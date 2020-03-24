package mypackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class StudentDetails {

    List<Student> listOfStudents = new ArrayList();
    Student s1 = new Student("Nick", 15, 70);
    Student s2 = new Student("Nick", 15, 95);
    Student s3 = new Student("Mary", 18, 85);
    Student s4 = new Student("James", 17, 70);
    
    
    

    public void addStudents() {
        listOfStudents.add(new Student("Mick", 30, 50));
        listOfStudents.add(new Student("Nick", 50, 95));
        listOfStudents.add(new Student("John", 10, 40));
        listOfStudents.add(new Student("Mary", 50, 60));
        listOfStudents.add(new Student("James", 50, 95));
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public Set<Student> getTreeSetOfStudents() {
        Set<Student> treeSetOfStudents = new TreeSet(listOfStudents);
        return treeSetOfStudents;
    }

    public TreeSet<Student> treeSetWithComparator() {
        StudentComparatorName myComparator = new StudentComparatorName();
        TreeSet<Student> treeSetStudentByName = new TreeSet(myComparator);
        treeSetStudentByName.add(new Student("Mick", 30, 50));
        treeSetStudentByName.add(new Student("Nick", 50, 95));
        treeSetStudentByName.add(new Student("John", 10, 40));
        treeSetStudentByName.add(new Student("Mary", 50, 60));
        treeSetStudentByName.add(new Student("James", 50, 95));
        treeSetStudentByName.add(new Student("Andy", 18, 85));

        return treeSetStudentByName;

    }
    
      public Set<Student> getLinkedHashSetOfStudents() {
        Set<Student> setOfStudents = new LinkedHashSet(listOfStudents);

        return setOfStudents; }

    public Map<String, Integer> getHashMapOfStudents() {
        Map<String, Integer> hashMap = new HashMap();
        hashMap.put("Nick", 80);
        hashMap.put("Mary", 60);
        hashMap.put("Jack", 90);
        hashMap.put("Nick", 90);
        return hashMap;
    }

    public void printMap() {
        Map<String, Integer> map = new HashMap();
        System.out.println("**Printing Map ****");
        Set<String> keysOfMap = map.keySet();
        for (String key : keysOfMap) {
            int bathmos = map.get(key);
            System.out.println(key + "->" + bathmos);
        }
    }

    public void printValuesOfMap(Collection<Integer> values) {
        Map<String, Integer> map = new HashMap();
        System.out.println("****Printing only values***");
        values = map.values();
        for (int value : values) {
            System.out.println(value);
        }

    }

    public static void mapEntries(Map<String, Integer> map) {
        System.out.println("****Printing Map.Entries****");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "--->>>" + entry.getValue());
        }

    }

public List <Student> getLinkedListOfStudents(){
        LinkedList <Student> linkedListOfStudents = new LinkedList(listOfStudents);
        return linkedListOfStudents;
    }
    
    public List<Student> getLinkedListOfJavaStudents(){
        LinkedList<Student> studentsInJava = new LinkedList();
        studentsInJava.add(new Student("Jonathan", 20, 0));
        return studentsInJava;
    }
public static List<Student> getLinkedListOfGeneralStudents(){
        LinkedList<Student> linkedListOfGeneralStudents = new LinkedList();
        linkedListOfGeneralStudents.add(new Student("Jack", 15, 80));
        linkedListOfGeneralStudents.add(new Student("Andy", 18, 85));
        Student s1 = new Student("Mary", 17, 95);
        linkedListOfGeneralStudents.add(s1);
        linkedListOfGeneralStudents.add(s1);
        return linkedListOfGeneralStudents;
    }  

public static void printListOfStudents(List<Student> list, String message){
        System.out.println(message);
        for(Student s:list){
            System.out.println(s);
            
        }
}
     public static void playWithLists() {
        List<Student> generalStudents = Student.getLinkedListOfGeneralStudents();
        Student.printListOfStudents(generalStudents, "\n***Printing General Students***");
        List<Student> javaStudents = Student.getListOfJavaStudents(generalStudents);

        Student.printListOfStudents(javaStudents, "\n***Printing Java Students***");

        Student.printListOfStudents(generalStudents, "\n***Printing General Students***");
     }

public static List<Student> getListOfJavaStudents(List<Student> list){
        //LinkedList<Student> studentsJava = linkedListStudents;
        LinkedList<Student> studentsJava = new LinkedList(list);
        //studentsJava.addAll(linkedListStudents);
        studentsJava.add(new Student("Jonathan", 20, 0));
        return studentsJava;
    }
    
 
        }
    }
    
     
}
    

