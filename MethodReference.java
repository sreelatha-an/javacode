import java.util.Arrays;
import java.util.List;

public class MethodReference {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList("nikhil","sree","latha");
        List<String> upNames =names.stream()
        //.map(str->str.toUpperCase()) // below also works
        .map(String::toUpperCase) // can use method reference
        .toList();
        //System.out.println("upNames == "+ upNames);

        //can also use at other placesS        
        //upNames.forEach(str->System.out.println(str));
        upNames.forEach(System.out::println);
       
    }

}
