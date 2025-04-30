public class DemoArry {
    public static void main(String[] args) {
    pck.ClassA obj = new pck.ClassA();
    // System.out.println(obj.marks);
    // Error: marks has private access in A
    // obj.displayMarks();
    // Error: displayMarks() has private access in A
    obj.show(); // This will work
    }
}