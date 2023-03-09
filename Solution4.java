//Write a Java program to count the frequency of each character in a string using a HashMap.
import java.util.*;
import java.util.HashMap;
public class Solution4 {
    public static void printMethod(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
         map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
       for(Map.Entry<Character,Integer> e : map.entrySet()){
        System.out.println(e.getKey() + ": " + e.getValue());
       } 
    }
   public static void main(String[]args){
    String  str = "Life is like roses";
    printMethod(str);
   } 
}
