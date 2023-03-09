import java.util.HashMap;
import java.util.*;
public class Solution1{
/**
 * @param args
 */
public static void main(String[]args){
    //creating an HashMap
    HashMap<String,Integer> map = new HashMap<>();
    map.put("Shailendra",23);
    map.put("Anisha",22);
    map.put("Prashant",22);
    map.put("Raghav",23);
    map.put("Raghav",29);
    System.out.println(map);
    if(map.containsKey("Shailendra")){
      Integer a = map.get("Shailendra");
      System.out.println(a);
    }
    for(Map.Entry<String,Integer> e : map.entrySet()){
        System.out.print(e+" ");
    }
}
}