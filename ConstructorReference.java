import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Resident{
    public String name;
    public int members;
    public Resident(){}
    public Resident(String name){this.name=name; members=3;}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMembers() {
        return members;
    }
    public void setMembers(int members) {
        this.members = members;
    }
    @Override
    public String toString() {
        return "Resident [name=" + name + ", members=" + members + "]";
    }
}
public class ConstructorReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("venkat","srinivas","sreelatha");

        // List<Resident> residents = names.stream()
        //         .map(name -> new Resident(name))
        //         .toList();
        /* can also be given as below */
        List<Resident> residents = names.stream()
                .map(Resident::new)
                .toList();
      //residents.forEach(residnt -> System.out.println(residnt.toString()));
      residents.forEach(System.out::println);

    }
}
