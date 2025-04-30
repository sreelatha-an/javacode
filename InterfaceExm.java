interface IntfA {
  int num=10;
  public void showIntfA();       
}
interface IntfB {
  int num=20;
  public void showIntfB();       
}
//should declare abstract if showA() is not implemented.
class ImpClsA implements IntfA,IntfB{
public void showClsA(){
  System.out.println("inside showClsA()...");
}
public void showIntfA(){
  System.out.println("inside showIntfA()...");
}
public void showIntfB(){
  System.out.println("inside showIntfB()...");
}
}
public class InterfaceExm {
    public static void main(String[] args) {
      IntfA inA = new ImpClsA();
      inA.showIntfA();
      //inA.showClsA();// cannot find error
      IntfB inB = new ImpClsA();
      inB.showIntfB();
      //inB.showIntfA();// cannot find symbol error
      //inB.showClsA();// cannot find symbol error
      System.out.println("inA.num=="+inA.num);
      System.out.println("inB.num=="+inB.num);
      System.out.println("IntfA.num=="+IntfA.num);
      //below - error: reference to num is ambiguous
      //System.out.println("ImpClsA.num=="+ImpClsA.num);
    /*  //below - error: reference to num is ambiguous
      ImpClsA clsA =  new ImpClsA();
      System.out.println("clsA.num=="+clsA.num);
*/
    }
}
