import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachList {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1,2,3,5,4,76,54);
        System.out.println("nums="+nums);
        // for(int n : nums){
        //     System.out.println("n= "+n);            
        // }
        // Consumer<Integer> cons = new Consumer<>() {
        //     public void accept(Integer n){
        //         System.out.println("forEach n= "+n);
        //     }
        // };
/* above isthe implementation of Consumer functional Interface
 * lambda expression for consumer
*/
//      Consumer<Integer> cons = n-> System.out.println("forEach n= "+n);        
//      nums.forEach(cons);
            nums.forEach(n->System.out.println("n= "+n));

//-------            
        // Consumer<Integer> consm = new Consumer<Integer>() {
        //     public void accept(Integer n){ 
        //         n=n*10;
        //          System.out.println("inside consm= "+n);
        //     }
        // };
           
        Consumer<Integer> consm = n->{ 
                    n=n*10;
                     System.out.println("inside consm= "+n);
                };

        nums.forEach(consm);
        //the below values wont change as Consumer only accept but not returning any values....
        System.out.println("nums after *10==>"+nums);
    }
}
