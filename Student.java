package mypackage;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + this.age;
        hash = 53 * hash + this.grade;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.age != other.age) {
            return false;
        }
        if (this.grade != other.grade) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", grade=" + grade + '}';
    }
    
    

    @Override
    public int compareTo(Student o) {
        int result = -(this.grade - o.grade);
        if(result == 0){
            result = this.age - o.age;
        }
        if(result == 0){
            result = this.name.compareTo(o.name);
        }
        return result;
    }
    
    
}
