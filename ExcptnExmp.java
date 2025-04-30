import java.io.FileNotFoundException;
import java.sql.SQLException;

class CustExcption extends ArithmeticException{
    public CustExcption(String string) {
        super(string);
        }
    }
    public class ExcptnExmp {
        /**
         * @param args
         */
        public static void main(String[] args) throws FileNotFoundException{
            int i=1,j;
            int nums[]=new int[5];
            try{
            j=30/i;
            System.out.println("numbs=="+nums[1]);
            System.out.println("j="+j);
            throw new CustExcption("check custException..");
        }
        //unreported exception CustExcption; must be caught or declared to be thrown
         catch(CustExcption ce){
             System.out.println("ce===>"+ce.getMessage());
         }
         //exception has already been caught compilation error.
        catch(ArithmeticException ae){
            System.out.println("ae==>"+ae.getMessage());
        }
        catch(Exception ee){
            System.out.println("ee=>"+ee.getMessage());
        }
    }
}
