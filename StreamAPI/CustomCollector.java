package logicprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CustomCollector implements Collector<String, List<String>, List<String>> {

	@Override
	public Supplier<List<String>> supplier() {
		return  ArrayList::new;
	}

	@Override
	public BiConsumer<List<String>, String> accumulator() {
		return List::add;
	}

	@Override
	public BinaryOperator<List<String>> combiner() {
		return (list1, list2)->{
			list1.addAll(list2);
			return list1;
		};
	}

	@Override
	public Function<List<String>, List<String>> finisher() {
		return list -> {
			list.sort(Comparator.comparingInt(String::length));
				return list;
		};
	}

	@Override
	public Set<Characteristics> characteristics() {
		return Collections.emptySet();
	}
	
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList("AI","Blockchain","ML","Cloud Computing","CyberSecurity","Data Science");
		
		List<String> list = words.stream()
				.collect(new CustomCollector());
		
		System.out.println("sorted list is: "+list);
	}

	
}


