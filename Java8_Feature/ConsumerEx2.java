import java.util.function.Consumer;

public class ConsumerEx2 {

	public static void main(String[] args) {
		Consumer<Integer> c1 = (i) -> {System.out.println(i*2);};
		
		Consumer<Integer> c2 = (i) ->{System.out.println(i*3);};
		
		c1.andThen(c2).accept(20);
	}

}
