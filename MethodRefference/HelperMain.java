package Methodref;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HelperMain {
	public static void main(String[] args) {
		Function<Integer, Double> fun=Helper::cube;
		
		 System.out.println(fun.apply(10));
		 
		 Consumer<Integer>con=Helper::consumer;
		 
		   con.accept(100);
		   
			
		   Predicate<Integer> pred=Helper::check;
		   
		   System.out.println(pred.test(13));
			
		}
	
}

class Helper{
	public static double cube(int i) {
		return i*i*i+1.0;
	}
	
	public static void consumer(int j) {
		System.out.println("Printing : "+j);
	}
	
	public static boolean check(int i) {
		return i>10;
	}
}