class FizzBizz{
	public static void main(String [] args){
		for(int i=1; i<=100; i++){
			if(i%3 == 0 && i%5 == 0){  // alternate  print fizzbizz means it is divisible by both 3 & 5
				System.out.print(" FizzBizz ");
			}
			if(i%3 == 0){  // alternate  print fizz means it is divisible by 3
				System.out.print(" Fizz ");
			}
			else if(i%5 == 0){  // alternate  print fizz means it is divisible by 5
				System.out.print(" Bizz ");
			}
			else{
			System.out.print(i+ "  ");
			}
		}
	}
}