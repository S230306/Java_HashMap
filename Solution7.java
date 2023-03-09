// clone the Hashamp 
import java.util.*;
public class Solution7 {
    public static void main(String[]args){
    // create a HashMap;
    HashMap<String,String> map = new HashMap<>();
    map.put("Shailendra","Anisha");
    map.put("Priyam","Avantika");
    map.put("Ritik","Anamika");
    map.put("Palak","Unknown");
    map.put("Jamirullah","Nikita");
    //print the original Hshamp;
     for(Map.Entry<String,String> e :map.entrySet()){
        System.out.println(e.getKey()+" "+e.getValue());
     }
     System.out.println();
     // clone the original Hshamp in to Another 
     HashMap<String,String> newMap =(HashMap<String,String>)map.clone();
     for(Map.Entry<String,String> e :newMap.entrySet()){
        System.out.println(e.getKey()+" "+e.getValue());
     }
    }
    
}
