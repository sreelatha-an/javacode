import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;

class Human {
    String name;    
    public Human (String name){ this.name=name;}
    public String getName(){return name;}
}
class Girl extends Human {    
    public Girl (String name){super(name);}
    public String getName(){return super.getName();}
}
class Employee<T> {
T obj;
public Employee(T obj){
    this.obj=obj;
}
public void display(){
    System.out.println("The obj name="+obj.getClass().getName());
}
public T getObj(){ return obj; }
}
public class GenericDateExm {

    public static void main(String[] args) {
        Employee<Integer> emp = new Employee<>(23);
        emp.display();
        System.out.println(emp.getObj());
            // wildcard....
        ArrayList<Human> humList =new ArrayList<>();
        humList.add(new Human("sree"));
        humList.add(new Human("Nikhil"));
        ArrayList<Girl> girlList = new ArrayList<>();
        girlList.add(new Girl("latha"));
        ArrayList <Human> chkList = new ArrayList<>();   
        //chkList = girlList; //error cannot convert girlist to humanlist
        chkList = humList;
        ArrayList <?> wildList = new ArrayList<>();            
        wildList = humList;
        System.out.println(wildList);
        //lowerbound wildcard
        ArrayList <? extends Human> wildListEx = new ArrayList<>();            
        //wildListEx = humList;
        //wildListEx = new ArrayList<>(girlList); 
        wildListEx = girlList;
        System.out.println(wildListEx);
        //upper bound wildcard
        ArrayList <? super Human> wildListSp = new ArrayList<>();
        wildListSp = humList;
        //wildListSp = girlList;//error incompatible types
        System.out.println("wildListSp== "+wildListSp);
System.out.println("**************");
        java.util.Date dt = new java.util.Date();
        java.sql.Date sdt = new java.sql.Date(dt.getTime());
        System.out.println("dt="+dt+", sdt="+sdt);
        LocalDate ldt = LocalDate.now();
        LocalDate pdt = LocalDate.parse("2007-12-03");
       System.out.println("ldt="+ldt+"  and pdt= "+pdt);
        
        DayOfWeek dw = ldt.getDayOfWeek();
        System.out.println("dw= "+dw);
        System.out.println("epoch: "+LocalDate.EPOCH);
        LocalTime lt = LocalTime.now();
        System.out.println("lt= "+lt); 
        
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);

        myMethod( 34);
        


    }
    public static <T extends Number> void myMethod(T obj){
     //   public static void <T>  myMethod(T obj){
     //error return type for method is missing
        System.out.println("check= "+obj);
    }
}