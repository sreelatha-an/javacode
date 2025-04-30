import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelStreamEx {
    public static void main(String[] args) {
        int size = 10_000;
        List<Integer> nums = new ArrayList<>(size);

        Random rand = new Random();        
        for(int i=1; i<=size;i++)
            nums.add(rand.nextInt(500));
        //System.out.println("nums="+nums);

        int sum1 = nums.stream()
                    .map(n -> n*2)
                    .reduce(0,(c,e)->c+e);
  long st1 = System.currentTimeMillis();                    
        int sum2 = nums.stream()
                    .map(n ->{ 
                        try{
                            Thread.sleep(1);
                        }catch(InterruptedException e){}
                         return n*2;
                        })   
                    .mapToInt(n->n)    
                    .sum();
  long st2 = System.currentTimeMillis();                    
        int sum3 = nums.parallelStream()
        .map(n ->{ 
            try{
                Thread.sleep(1);
            }catch(InterruptedException e){}
             return n*2;
            }) 
                    .mapToInt(n->n)
                    .sum();                                 
  long st3 = System.currentTimeMillis();                    

    System.out.println(sum1+" :: "+ sum2+" :: "+ sum3);                    
    System.out.println("seq time: "+ (st2-st1) );    
    System.out.println("parallel time: "+ (st3-st2) );    

    }
}
