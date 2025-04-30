class Calcx {
    //public int add(int a, int b)   return a+b;
    public int add(int a, int b,int c)  { return a+b+c; }
    public double add(double a, double b) { return a+b; }

}
public class DataTypes {
    /**
     * @param args
     */
    public static void main(String[] args) {
     int a=2,b=8,c=30;
       Calcx cc = new Calcx();
        System.out.println("cr="+cc.add(a,b));
        System.out.println("cr="+cc.add(a,b,(int)10.4));
  
    }
}