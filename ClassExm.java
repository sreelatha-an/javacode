  class ClsExm {
    public ClsExm(String xx){
        System.out.println("created clsExm public "+xx);
    }
     public ClsExm(){
        System.out.println("created clsExm public");
    }
    public int add(int x){ return x+x;    }
}
public class ClassExm{
    public static void main(String[] args) {

    ClsExm xls = new ClsExm("sree");
    new ClsExm().add(8); 
    //anonymous object can be created and used only once as no reference variable
    }
}
