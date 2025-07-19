public class FactorialRecursion {
    public static int fact(int n){
        if(n==0 || n==1){  //base case
            return 1;
        }
        int fn = fact(n-1);
        return n * fn;  //recursive call
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(fact(n));

    }
}
