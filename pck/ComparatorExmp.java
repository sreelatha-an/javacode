package pck;
import java.util.*;
class Student {
    int age;
    String name;
    public Student(int age, String name) {
    this.age = age;
    this.name = name;
    }
    @Override
    public String toString() {
    return name + " (" + age + ")";
    }
   }
   public class ComparatorExmp {
    public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student(33, "Navin"));
    students.add(new Student(12, "John"));
    students.add(new Student(45, "Edward"));
    students.add(new Student(35, "Michael"));
// Sorting based on age
Comparator<Student> com = (s1, s2) -> (s1.age >
s2.age) ? 1 : -1;
//Comparator interface has compare(), shld override it
 Collections.sort(students, com);
 for (Student s : students) {
 System.out.println(s);
 }
}
}