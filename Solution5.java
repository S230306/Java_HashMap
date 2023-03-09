//Write a Java program to find the first non-repeated character in a string using a HashMap.
import java.util.*;
import java.util.HashMap;
public class Solution5 {
    public static void printNonRepeat(String str){
     HashMap<Character,Integer> map = new HashMap<>();
     for(int idx =0;idx<str.length();idx++){
        char ch =str.charAt(idx);
        map.put(ch,map.getOrDefault(ch,0)+1);
     }
     for(int idx=0;idx<str.length();idx++){
        char ch = str.charAt(idx);
        if(map.get(ch)==1){
            System.out.println(ch);
            return;
        }
     }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printNonRepeat(str);
    }
}
