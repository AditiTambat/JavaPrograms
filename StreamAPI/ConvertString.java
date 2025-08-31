import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertString {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Tom");
		names.add("Moana");
		names.add("John");
		names.add("Jerry");
		
		names.stream().map(i->i.toUpperCase()).forEach(i->System.out.println(i));
	}
	
	
		
	
}
