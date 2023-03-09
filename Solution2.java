import java.util.HashMap;
import java.util.*;
public class Solution2{
/**
 * @param args
 */
public static void main(String[]args){
    //creating an HashMap
   // iteration is not prereserved.
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
     //in hashmap iteration order is not prereserved to prereserved that use the LinkedHashmap
    HashMap<String,Integer> mp = new LinkedHashMap<>();
    mp.put("Shailendra",23);
    mp.put("Anisha",22);
    mp.put("Prashant",22);
    mp.put("Raghav",23);
    mp.put("Raghav",29);
    System.out.println(map);
    if(mp.containsKey("Shailendra")){
      Integer a = mp.get("Shailendra");
      System.out.println(a);
      System.out.println(mp.entrySet());
      System.out.println(mp);
    }
    for(Map.Entry<String,Integer> e : mp.entrySet()){
        System.out.print(e+" ");
    }
}
}
