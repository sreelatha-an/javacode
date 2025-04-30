@FunctionalInterface
interface Intfsam{
   public void disp();
  //error: Intfsam is not a functional interface
  // multiple non-overriding abstract methods found 
  //public void ss();
} 
@FunctionalInterface
interface IntfsamParam{
    String disparam(int x,String b);  
} 
public class FunctIntrface {
    public static void main(String[] args) {
        Intfsam sam1 = new Intfsam() {
            public void disp(){
                System.out.println("SAM disp as anonymous Inner class..");
            }        
        };
        sam1.disp();
        Intfsam sam2 =() -> 
                System.out.println("SAM2 disp as anonymous Inner class..");             
        
        sam2.disp();
        //error: invalid lambda parameter declaration 
        //if  we mention as (int y,s) -> 
        IntfsamParam samp1 =( y, s) -> 
                ("SAMParam1 disp lambda exp: no. "+y+" for "+s);             
        String str = samp1.disparam(5," nikhil");

        System.out.println("lambda exp result:: "+str);

    }
}
