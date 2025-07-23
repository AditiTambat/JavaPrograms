import java.util.function.Predicate;

public class PredicateEx {
	
	static void somecondition(int i, Predicate <Integer> pred) {
		if(pred.test(i)) {
			System.out.println("You can proceed!");
		}
		else {
			System.out.println("Something went wrong, try again..");
		}
	}

	public static void main(String[] args) {
		somecondition(100,(i)->(i<1000));
		somecondition(1500,(i)->(i<1000));
	}

}
