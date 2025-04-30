public class InheritanceExmp {
    public static void main(String[] args) {
        
        Calc cal = new ScCalc();
        double r1 = cal.add(1, 5);
        int r4 = cal.sub(1, 5);
        System.out.println("add="+r1);
        System.out.println("sub="+r4);

        System.out.println("----------------");
        ScCalc scal = new ScCalc();
        int r2 = scal.mult(1, 5);
        double r3 =  scal.power(3, 5);
        System.out.println("mul="+r2);
        System.out.println("pow="+r3);
        
    }
}
