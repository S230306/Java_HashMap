//Write a Java program to find the most frequent Element in an array using a HashMap.
import java.util.*;
public class Solution11 {
public static void mostFreqElem(int[]arr){
    int max=0;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int idx=0;idx<arr.length;idx++){
        map.put(arr[idx],map.getOrDefault(arr[idx],0)+1);
    }
    for(int idx=0;idx<arr.length;idx++){
        if(map.get(arr[idx])>max){
            max = arr[idx];
        }
    }
    System.out.print(max);
}
public static void main(String[]args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[]arr=new int[n];
    for(int idx=0;idx<arr.length;idx++){
     arr[idx]=scn.nextInt();
    }
    mostFreqElem(arr);
}
}
