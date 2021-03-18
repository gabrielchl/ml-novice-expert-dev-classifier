import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int[] arr)
     {
         long max=0 ,min=0;
         for(int i=0;i<arr.length;i++)
         {
             for(int j=0;j<arr.length-1-i;j++)
             {
                 if(arr[j+1]<arr[j])
                 {
                     int t=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=t;
                 }
             }
         }
         for(int i=0;i<4;i++)
         min+=arr[i];
         for (int i = arr.length-1; i >=arr.length-4; i--)
            max += arr[i];
        System.out.print(min+ " "+max);



    }

}
