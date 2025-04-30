public class ScCalc extends AdvCalc {
    public double power(int a, int b){
        return Math.pow(a, b);
    }
    
    public int add(int a, int b)
    {
        return a+b+20;
    }
    public ScCalc(){
        super("from scCalc()");
        System.out.println("In ScCalc constructor");
    }
}
