import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] ans = new int[queries.length];
        if(k==a.length)
            {
                   for(int i=0;i<queries.length;i++){
                ans[i] = a[queries[i]];
            }
            return ans;
            }
            else
            {
                if(k>a.length){
                     k=k-a.length;
                }

            }
             for(int i=0;i<k;i++){
                int temp = a[(a.length-1)];

                for(int j=a.length-1;j>0;j--){

                    a[j] = a[j-1];
                }
                a[0]= temp;
            }
            for(int i=0;i<queries.length;i++){
                ans[i] = a[queries[i]];
            }
            return ans;

    }

}
