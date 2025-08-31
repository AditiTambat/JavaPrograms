package CollectorInterf;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Collector2 {
	public static void main(String[] args) {
		String sent = Arrays.asList("pune ","is ","a ","green ","city ")
		.stream()
		.collect(new nameappender());
		
		System.out.println(sent);
	}
}

class nameappender implements Collector<String, StringBuilder, String>{

	@Override
	public Supplier<StringBuilder> supplier() {
		Supplier<StringBuilder> s = ()->(new StringBuilder());
		
		return s;
	}

	@Override
	public BiConsumer<StringBuilder, String> accumulator() {
		BiConsumer<StringBuilder, String> b=(sb, s)->{
			sb.append(s);
		};
		return b;
	}

	@Override
	public BinaryOperator<StringBuilder> combiner() {
		BinaryOperator<StringBuilder> bin =(sb1, sb2)->(sb1.append(sb2));
		return bin;
	}

	@Override
	public Function<StringBuilder, String> finisher() {
		Function<StringBuilder, String> fun=(sb)->(sb.toString().toUpperCase());
		
		return fun;
	}

	@Override
	public Set<Characteristics> characteristics() {

		return Collections.EMPTY_SET;
	}
	
}
