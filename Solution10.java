//Write a Java program to find the most frequent Character in an String using a HashMap.
import java.util.*;
public class Solution10 {
    public static char MostFrequentChar(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        int maxCount = 0;
        char maxChar = ' ';
        for(int idx=0;idx<str.length();idx++){
            char ch = str.charAt(idx);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int idx=0;idx<str.length();idx++){
            char ch = str.charAt(idx);
            int count = map.get(ch);
            if(count>maxCount){
                maxCount=count;
                maxChar = ch;
            }
        }
        return maxChar;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.print(MostFrequentChar(str));
    }
}
