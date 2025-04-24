import java.util.Random;

public class GenerateRandomNumbers extends Thread { //thread is in lang pack, not to import
	
	public void run() {
		int [] numbers = new int[10];
		Random r = new Random();
		for(int i=0; i<20; i++) {
//			r.nextInt();
//			System.out.println(r.nextInt());
			
			try {
				Thread.sleep(1000);  // this will stop thread execution for 1sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("random number "+r.nextInt(100, 1000));
		}
	}
	
}
