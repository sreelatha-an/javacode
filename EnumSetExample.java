import java.util.EnumSet;
import java.util.Set;
import java.util.TreeSet;

public class EnumSetExample {

	enum Fruit {APPLE, MANGO, LEECHI, GUAVA, GRAPES};
	
	public static void main(String[] args) {
		
		Set<Fruit> set = EnumSet.of(Fruit.APPLE, Fruit.MANGO);
		
		for(Fruit fruit : set) {
			System.out.println(fruit.toString());
		}
		Set <Fruit>st = new TreeSet<>();
        st.add(Fruit.APPLE);
		st.add(Fruit.GUAVA);

        
	}
}

