//Write a Java program to find the first non-repeating character in a given string using a HashMap.
import java.util.*;
public class Solution8 {
    public static Character firtNonRepeat(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int idx=0;idx<str.length();idx++){
            char ch = str.charAt(idx);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int idx=0;idx<str.length();idx++){
            char ch = str.charAt(idx);
            if(map.get(ch)==1){
                return ch;
            }
        }
        return null;
    }
    public static void main(String[]args){
       Scanner scn = new Scanner(System.in);
       String str = scn.next();
       System.out.print(firtNonRepeat(str));
    }
}
