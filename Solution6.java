//Write a program to count the number of occurrences of each word in a given text using a HashMap.
import java.util.*;
public class Solution6 {
    public static HashMap<String, Integer> countWords(String text){
        HashMap<String,Integer> map = new HashMap<>();
         String[] words = text.split("\\s+");
        for (String word : words) {
           map.put(word, map.getOrDefault(word,0)+1);
        }
        return map;
    }
   
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = scn.nextLine();
        HashMap<String,Integer> map = countWords(text);
        for(Map.Entry<String,Integer> e : map.entrySet()){
        System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
