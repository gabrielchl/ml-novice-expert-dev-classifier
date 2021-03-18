import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static public void miniMaxSum(int[] arr){
        
        long min,max,cont;
        min = max =  cont = 0;
        
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length-1; i++){
            
            min+=arr[i];
        }
        
        for(int i=arr.length-1; i>0; i--){
            
            max+=arr[i];
        }
        
        
        System.out.print(min+" "+ max);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        miniMaxSum(arr);
    }
}
