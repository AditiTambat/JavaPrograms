import java.util.function.Predicate;

public class PedicateExample2 {
	
    public static void main(String[] args) {
		Predicate<Integer> pred1 = (i) ->(i>10);
		
		Predicate<Integer> pred2 = (i)->(i<100);
		
		System.out.println(pred1.and(pred2).test(500));
		
		System.out.println(pred1.or(pred2).test(500));
		System.out.println(pred1.or(pred2).negate().test(500));
	}
//	public static void main(String[] args) {
//		Cars car = new Cars(101,"Fords", 120000);
//		
//		Predicate<Cars> isexpensive = (ca) -> {
//			if(ca.price>100000) {
//				return true;
//			}else {
//				return false;
//			}
//		};
//		System.out.println(isexpensive.test(car));
//		
//		
//	}
}

class Cars{
	int id;
	String name;
	double price;
	
	Cars(int id, String name, double price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
}
