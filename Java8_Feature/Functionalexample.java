import java.util.function.Function;

public class Functionalexample {
	public static void main(String[] args) {
		Function <Integer, Double> fun = (i)->(i*2.0);
		
		Function<Double, Double> fun2 = (i)->(i*1.0);
		
		Function<Integer, Double> fun3 = fun2.compose(fun);
		System.out.println(fun3.apply(100));
		
		Function<Integer, Double> fun4 = fun.andThen(fun2);
		System.out.println(fun4.apply(100));
		
	}
}
