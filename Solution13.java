//Write a Java program to check if a specific key exists in a HashMap.
import java.util.*;
public class Solution13 {
  public static void specificKey(int[]arr,int key){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int idx=0;idx<arr.length;idx++){
        map.put(arr[idx],map.getOrDefault(arr[idx],0)+1);
    }
    // for(Map.Entry<Integer,Integer> e :map.entrySet()){
    //     System.out.print(e.getKey()==key?true:false);
    //     return;
    // }
    System.out.println(map.containsKey(key));
}
  public static void main(String[]args){
    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // int[]arr=new int[n];
    // for(int idx=0;idx<arr.length;idx++){
    //     arr[idx]=scn.nextInt();
    // }
    //int  specificKey = scn.nextInt();
    int[]arr={8,2,3,4,5,6,7,8,9};
    int  specificKey = 8;
    specificKey(arr, specificKey);
  }
}
