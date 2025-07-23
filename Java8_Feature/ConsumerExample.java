import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("GrEAps");
		list.add("manGo");
		list.add("BanaNA");
		list.add("WaterMELON");
		list.add("CherrY");
		
		ConsumerImp c1 = new ConsumerImp();
		c1.accept(list);
		
	}

}

class ConsumerImp implements Consumer<List<String>>{

	@Override
	public void accept(List<String> t) {
		for(String i:t) {
			System.out.println(i.toUpperCase());
		}
	}
	
}
