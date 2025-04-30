package pck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsExm {
    public static void main(String[] args) {
      //  Collection<Integer> al = new ArrayList<Integer>();
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(9);
        al.add(4);
        al.add(4);
        //al.add(null);   allows null but sort gives nullpointer exception
        System.out.println("al=="+al);
        Collections.sort(al); // Sorting using built-in Collections class
        System.out.println("soreted: "+al);
        System.out.println("index of 4 = "+al.indexOf(4));


        //Set <Integer>st = new HashSet();
        Set <Integer>st = new TreeSet<>();
        st.add(10);
        st.add(32);
        st.add(93);
        st.add(47);
        //boolean b = st.add(null);// set will not allow
        boolean b =st.add(32);
        System.out.println("add() boolean->"+b);
        System.out.println("st="+st);
        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
           System.out.println("it=="+it.next());
        }
Map<String, Integer> students = new HashMap<>();
//Hashtable not allows null, thread safe synchronized
 students.put("Navin", 56);
 students.put("Harsh", 65);
 students.put("Sushil", 73);
 students.put("Kiran", 96);
 students.put("Harsh", 89);
 students.put(null, 89);
 students.put(null, 33);
 System.out.println(students);
 for (String name : students.keySet()) {
    System.out.println(name + ": " +
   students.get(name));
    }
System.out.println(students.entrySet());

Hashtable<String, Integer> studtable = new Hashtable<>();
studtable.put("sree",20 );
studtable.put("nikhil",49 );
studtable.put("latha",32 );
studtable.put("sree",25 );
Enumeration<Integer> enumr = studtable.elements();
while(enumr.hasMoreElements())
   System.out.println("enumr== "+enumr.nextElement());
   
}
    
}
