package pck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//just like Integers if implements Comparable we can override compareTo 
// and use Collections.sort

class Studentc implements Comparable<Studentc> {
    int age;
    String name;
    public Studentc(int age, String name) {
    this.age = age;
    this.name = name;
    }
    @Override
    public int compareTo(Studentc that) {
    if (this.age > that.age)
    return 1;
    else
    return -1;
    }
    @Override public String toString() {
        return "Studentc{name='" + name + "', age=" + age + "}"; 
        }
    }
public class CoparableExmp {
    public static void main(String[] args) {
 List<Studentc> students = new ArrayList<>();
 students.add(new Studentc(33, "Navin"));
 students.add(new Studentc(12, "John"));
 students.add(new Studentc(45, "Edward"));
 students.add(new Studentc(35, "Michael"));
 Collections.sort(students); // Sorting using Comparable
 for (Studentc s : students) {
 System.out.println(s);
 }
 }

}
