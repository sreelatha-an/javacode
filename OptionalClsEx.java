import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClsEx {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("free","sree","latha","mammulu","nikhil");

     Optional<String> finame =    names.stream()
        .filter(str->str.contains("kk"))
        .findFirst();
    
        System.out.println("findname="+finame);     
    // findname=Optional.empty   or
    // findname=Optional[free]
    //below java.util.NoSuchElementException: No value present
    //System.out.println("if not found=="+ finame.get());
    System.out.println("if not found=="+ finame.orElse("not available"));
    }
}
