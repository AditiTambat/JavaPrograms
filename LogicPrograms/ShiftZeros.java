public class ShiftZeros {

   public static void shiftingZeros(int[] arr){
       int count =0;
       for(int i=0; i<arr.length; i++){
           if(arr[i] != 0){
               int temp = arr[i];
               arr[i] = arr[count];
               arr[count] = temp;
               count++;
           }
       }
   }

    public static void main(String[] args) {
        int [] arr = {0,1,0,0,4,0,5};
        shiftingZeros(arr);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
