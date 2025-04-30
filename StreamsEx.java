import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsEx {
public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1,4,5,4,0,2,7,6,9,8);
    Stream<Integer> s1 = nums.stream();    
    //s1.forEach(n-> System.out.println("n="+n));
    //2nd time it wont work
    //error stream has already been operated upon or closed
    //s1.forEach(n-> System.out.println("n="+n));

    Predicate<Integer> pr = new Predicate<Integer>() {
        public boolean test(Integer n){
            return n%2==0;
        }
    };
    Function<Integer,Integer> fn = new Function<Integer,Integer>(){
        public Integer apply(Integer n){
            return n*2;
        }
    };

    Stream<Integer> s2 = s1.filter(n->n%2==0);//pr
    Stream<Integer> s3 = s2.map(n->n*2);//fn
    Stream<Integer> s4 = s3.distinct();
    Stream<Integer> s5 = s4.sorted();
    int k=0;
    int result = s5.reduce(k,(c,e)-> c+e+k);
    // here 10 is also added to the elements in result
    System.out.println("result=="+result);
    //s5.forEach(n-> System.out.println("n="+n));
}
    
}
