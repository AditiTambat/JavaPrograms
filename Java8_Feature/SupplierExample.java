import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier <String> s1 = ()->(":10");
		Supplier <Double> d1 = ()->(Math.random());
		
		int otp =(int)(d1.get()*10000);
		if(otp<=999) {
			otp=(int)(d1.get()*10000);
		}
		System.out.println(otp);
		
	}
}
