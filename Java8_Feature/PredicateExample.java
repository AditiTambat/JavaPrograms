import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		//lamda expression
		Predicate<Integer> isEven = (i) -> (i%2 == 0);
		
		//anonymous class
		Predicate<Integer> isPrime = new Predicate<Integer>() {
			public boolean test(Integer i) {
				for(int j=2; j<=(i/2); j++) {
					if(i%j == 0) {
						return false;
					}
				}
				return true;	
			}
		};
		System.out.println(isPrime.test(24));
	}
}
