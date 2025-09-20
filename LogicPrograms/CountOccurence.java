import java.util.HashMap;

public class CountOccurence {



   public static void occurence(String str){
       HashMap<Character,Integer> map = new HashMap<>();
       str = str.toLowerCase();

       for(char c: str.toCharArray()){
           if(map.containsKey(c)){
               map.put(c,map.get(c)+1);
           }else{
               map.put(c,1);
           }
       }

       for(char key:map.keySet()){
           System.out.println(key+ "->" +map.get(key));
       }



   }

    public static void main(String[] args) {

//    String str = "Programming";
        String str = "madam";
    occurence(str);




    }
}
