package CollectorInterf;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collector1 {
	public static void main(String[] args) {
	Map<Object, List<String>>fruits=Arrays.asList("mango","apple","banana","grapes")
		.stream()
		.map((s)->(s.toUpperCase()))
		.collect(Collectors.groupingBy((s)->(s.charAt(0))));
		
		System.out.println(fruits);
	}
}
