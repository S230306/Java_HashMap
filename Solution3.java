//copy the one HashMap to Another HashMap by using putAll() methods.
import java.util.*;
public class Solution3 {
    public static void main(String[]args){
        //creating a HashMap.
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Anisha",23);
        map.put("Manju",22);
        map.put("Shweta",24);
        map.put("Mahira",23);
        map.put("Akliniya",23);
        map.put("Subhra",26);
        //creating a new HashMap.
        HashMap<String,Integer> newMap = new HashMap<>();
        newMap.putAll(map);
        System.out.print(newMap);
        System.out.println();
        //iterate over the newMap;
        for(Map.Entry<String,Integer> e : newMap.entrySet()){
            System.out.print(e+" ");
        }
        System.out.println("Jump to new line");
        // copy the HashMap using the constructor.
       // create Another HashMap.
       HashMap<String,Integer> new1Map = new HashMap<>(map);
       System.out.print(new1Map);
       for(Map.Entry<String,Integer> e : new1Map.entrySet()){
        System.out.print(e+" ");
    }
      //iterate over the newMap;
      for(Map.Entry<String,Integer> e : newMap.entrySet()){
        System.out.print(e+" ");
    }
     System.out.println("Jump to new line");
    // copy the HashMap using the constructor.
   // create Another HashMap.
     HashMap<String,Integer> new2Map = (HashMap<String,Integer>) map.clone();
     for(Map.Entry<String,Integer> e : new2Map.entrySet()){
        System.out.println(e+" ");
    }

    }
}
