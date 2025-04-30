abstract class Abs1{
    abstract public void display();
     public  Abs1() //abstract modifier not allowed here
    {
        System.out.println("inside abs1()");
    }
}

 class Abs2 extends Abs1{
    public Abs2(){
        System.out.println("inside abs2()");
    }
    public void display(){
        System.out.println("implemented abstract method..");
    };
    public void ddd(){
        System.out.println("check this out..");
    }
}

public class Abstrct {
    
public static void main(String[] args) {
   Abs1 abs= new Abs2();
   abs.display();
   //abs.ddd(); //cannot find symbol error..

}

}
