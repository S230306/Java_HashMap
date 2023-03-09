//Given an array of integers, write a Java program to find the pairs of integers that add up to a given sum, using a HashMap.
import java.util.*;
public class Solution9 {
    public static void findTargetSumPair(int[]arr,int target){
      HashMap<Integer,Integer> map = new HashMap<>();
      for (int i = 0; i < arr.length; i++) {
        int complement = target - arr[i];
        if (map.containsKey(complement)) {
            System.out.println(arr[i] + ", " + complement);
        }
        map.put(arr[i], i);
    }
}
    public static void main(String[]args){
        int[] arr = {2, 3, 4, 5, 6, 7, 8};
        int sum = 10;
        findTargetSumPair(arr, sum);
    }
}
