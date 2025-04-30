class Out{
    public Out()
    { System.out.println("out constructor");}
    void disp(){
        System.out.println("inside out dips()");
     //   ins.dispin();
    }    
   // In ins = new In();

    // can also be static
    public class In{
        public In(){ System.out.println("In constructor");}
        void dispin(){
            System.out.println("inside in dispin()");
        }
    }
    
}
abstract class AbsOut{
    abstract public void check();
}
public class InnerExm {
    public static void main(String[] args) {
        Out ot = new Out(){
            
            void disp(){ 
            System.out.println("inside anonymous class");}
        };
        ot.disp();
        Out.In inn = ot.new In();
        //Out.In inn = new Out.In(); //if In is static class
        inn.dispin();  
        AbsOut absout = new AbsOut() {
            public void check(){ System.out.println("in anonymous override method check()");}            
        };
        absout.check();
    }

}
