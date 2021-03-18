import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] arr, int k, int[] queries) {
        ArrayList<Integer> a = new ArrayList<>();

        //System.out.println(arr.length-1-k);

        if(k>arr.length)
            k%=arr.length;

        for(int i=arr.length-k;i<arr.length;i++){
            a.add(arr[i]);
        }
        for(int i=0;i<arr.length-k;i++){
            a.add(arr[i]);
        }
        int ans[] = new int[queries.length];

        for(int i=0;i<ans.length;i++){
            ans[i] = a.get(queries[i]);
        }

        return ans;

    }

}
