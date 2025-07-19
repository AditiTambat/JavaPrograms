public class FibonacciRecursion {

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fb1 =  fib(n-1) ;
        int fb2 = fib(n-2);
        return fb1 + fb2;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fib(n));
    }
}
