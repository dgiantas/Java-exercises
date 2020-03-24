package mypackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import static mypackage.StringUtil.playWithNames;

/**
 * @author user
 */
public class PlayWithCollections {

    public static void main(String[] args) {
        
        playWithNames();
        
        

        
List<Student> listOfStudents = new ArrayList();
    getListOfStudents();

        
        Set<String> hashSet = new HashSet();
        hashSet.add("Nick");
        hashSet.add("Nick");
        hashSet.add("Mary");
        for (String name : hashSet) {
            System.out.println(name);
        }
        
        

        Set<Student> setOfStudents = new LinkedHashSet();

        System.out.println("s1==s2:" + (s1 == s2));
        System.out.println("s1.equals(s2):" + s1.equals(s2));
        setOfStudents.add(s1);
        setOfStudents.add(s2);
        setOfStudents.add(s3);
        
    

    public static void printSetOfstudents(Set<Student> setOfStudents) {

        for (Student student : setOfStudents) {
            System.out.println(student);
        }
    }

    private static void getListOfStudents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Set<String> treeSet = new TreeSet();

    treeSet.add ("Nick");
    treeSet.add ( "Mary");
    treeSet.add ("Nick");
    treeSet.add ("Jonathan");
    treeSet.add ("Andy");
        
        public void printStringTreeSet() {
        System.out.println("****Printing TreeSet of names****");
        for (String name : treeSet) {
            System.out.println(name);
        }

    }

    Set<Student> treeSetStudents = new TreeSet();

treeSetStudents.add (s1);
treeSetStudents.add (s2);
treeSetStudents.add (s3);
treeSetStudents.add (new Student("Andy", 18, 85));
       
        public void printStudentTreeSet() {
        System.out.println("****Printing TreeSet of Students****");
        for (Student s : treeSetStudents) {
            System.out.println(s);
        }
    }

    StudentComparatorName myComparator = new StudentComparatorName();

    TreeSet<Student> treeSetStudentByName = new TreeSet(myComparator);

    treeSetStudentByName.addAll (treeSetStudents);

    System.out.println ("****Printing TreeSet of Students By Name****");
    for (Student s : treeSetStudentByName ) {
            System.out.println(s);
    }

    System.out.println ( "\n****Playing with Maps*****");
        Map<String, Integer> map = new HashMap();
        map.put ("Nick", 80);
        map.put ("Mary", 60);
        map.put ("Jack", 90);
        map.put ("Nick", 90);
    boolean exists = map.containsKey("Mary");

    System.out.println ("exists:" + exists);
    map.replace ( "Mary", 100);
        int grade = map.get("Mary");

    System.out.println ( "grade:" + grade);
        
//        for(Map.Entry<String,Integer> entry: map.entrySet()){
//            System.out.println(entry.getKey()+"--->"+entry.getValue());
//        }
    
    names.add ("Nick");
    names.add ("Jack");
    names.add ("John");
    
    Set<String> names = new HashSet();

//        for (String name : names) {
//            System.out.println(names);
//            if (name.equals("Nick")) {
//                names.remove(name);
//                names.add("Nick_Nickolaou");
//            }
//        }
        Iterator<String> it = names.iterator();

    while(it.hasNext () ){
            String name = it.next();
        if (name.equals("Nick")) {
            it.remove();
        }
    } System.out.println (names);
    
    Set<Integer> set = new HashSet();

    set.add ( 4);
    set.add (5);
    set.add (1);
    set.add (0);
    for(int number:set){
            System.out.print(number + ",");
        if (number == 1) {
            set.remove(number);
        }
    }
}

}
