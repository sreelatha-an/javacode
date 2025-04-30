public class StringExm {
    public static void main(String args[]){
   /* String s1 = new String("sree");
    String s2 =  s1; //new String("sree");
    
    System.out.print("  check ");
    System.out.println( s1==s2);
    System.out.println("equals : "+ s1.equals(s2));
*/

StringBuffer sb = new StringBuffer("latha");
System.out.println("Capacity: " + sb.capacity()); // Output: 21
System.out.println("Length: " + sb.length()); // Output: 5
sb.append(" nikhils mother. and baby is good");
System.out.println(sb); // Output: navin reddy
sb.insert(10," check ");
System.out.println("Capacity: " + sb.capacity()); // Output: 21
System.out.println("Length: " + sb.length()); // Output: 5
String str = sb.toString();
System.out.println(str);

StringBuilder bld = new StringBuilder( sb.toString());
System.out.println("bld Capacity: " + bld.capacity()); // Output: 21
System.out.println("bld Length: " + bld.length()); // Output: 5
System.out.println("bld: "+bld);

    }
}
