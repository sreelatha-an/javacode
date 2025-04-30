public class AdvCalc extends Calc{

    public int mult(int a, int b){
        return a*b;
    }
    public AdvCalc(){
        System.out.println("In AdvCalc constructor");
    }
    public AdvCalc(String str){
        this();        
        System.out.println(str+" in AdvCalc()");
    }

}