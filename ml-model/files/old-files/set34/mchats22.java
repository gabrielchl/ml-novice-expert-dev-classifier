import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int n=a.length-1;
        for(int i=0; i<k; i++){
            int temp=a[a.length-1];
            for(int j=n-1; j>=0; j--){
                a[j+1]=a[j];
            }
            a[0]=temp;
        }
        int b=queries.length;
        int arr[] = new int[b];
       for(int z=0; z<b; z++){
            arr[z]=a[queries[z]];
        }
        return arr;
    }

}
