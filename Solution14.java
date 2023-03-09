//Write a Java program to convert a HashMap to an ArrayList.
import java.util.*;
public class Solution14 {
    public static void main(String[]args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Shailendra",24);
        map.put("Anisha",23);
        map.put("Priyank",32);
        map.put("Shashank",45);
        map.put("Gargi",24);
        // convert the the hashmap in to the ArrayList;
        ArrayList<Map.Entry<String,Integer>> arr = new ArrayList<>(map.entrySet());
        System.out.print(map);
        System.out.print(arr);
        }
    }

