import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int solve(List<Integer> a) {
    int arr[]=new int[a.size()];
    int k=0;
    for(Integer b:a){
        arr[k]=b; k++;
    }
    Arrays.sort(arr);
    int max=0;
    for(int i=0;i<arr.length-1;i++){
        int f=arr[i];
        int count=1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]==f || arr[j]==f+1){
                count++;
            }
        }
        max=count>max?count:max;
    }
    return max;

    }

}
