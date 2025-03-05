import java.util.Scanner;
class FindLargest{
    
    public void largestNum(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            System.out.println("largest is : "+num1);
        }
        else if(num2> num1 && num2> num3){
            System.oout.println("largest is :"+num2);
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println("largest is :"+num3);
        }
    }
    
    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       int no = sc.nextInt();
       FindLargest l1 = FindLargest();
       l1.largestNum();
    }
}