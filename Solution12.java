// Write a Java program to find the intersection of two arrays using a HashMap.
import java.util.*;
public class Solution12 {
    public static void InterSectionTarray(int[]arr1,int[]arr2){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int idx=0;idx<arr1.length;idx++){
            map.put(arr1[idx],map.getOrDefault(arr1[idx],0)+1);
        }
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int idx=0;idx<arr2.length;idx++){
         map1.put(arr2[idx],map1.getOrDefault(arr2[idx],0)+1);
        } 
        ArrayList<Integer> arr = new ArrayList<>();
        for(int key:map.keySet()){
            if(map1.containsKey(key)){
                arr.add(key);
            }
        }
        for(int x : arr){
            System.out.print(x+" ");
        }
    }

     public static void main(String[]args){
        //Scanner scn = new Scanner(System.in);
        // int n  = scn.nextInt();
        // int[]arr1=new int[n];
        // for(int idx=0;idx<arr1.length;idx++){
        //     arr1[idx]=scn.nextInt();
        // }
        // int m = scn.nextInt();
        // int[]arr2 = new int[m];
        // for(int idx=0;idx<arr2.length;idx++){
        //     arr2[idx]=scn.nextInt();
        // }
        int[]arr1 = {1,2,3,4,5,6,7,4,8,5,4};
        int[]arr2 = {2,3,4,5,7,8};
        InterSectionTarray(arr1,arr2);
    }
}
