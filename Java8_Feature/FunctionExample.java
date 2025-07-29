import java.util.function.Function;

public class FunctionExample {
	
	static Double convert(int i, Function<Integer, Double> fn) {
		return fn.apply(i);
	}

	public static void main(String[] args) {
		Function<Integer, Double> f1 = (i)->(i*2.0);
		
		Function<Double,Double> f2 = (i)->(i*4.0);
		System.out.println(convert(10, (i)->(i*2.0)));
		
		Function<Integer,Double>  f3 = f2.compose(f1);
		     
		System.out.println(f3.apply(100));
	}

}
