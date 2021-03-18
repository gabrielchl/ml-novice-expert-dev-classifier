import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
            int count=0;
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        Arrays.sort(ar);
        int sum=ar[n-1];
        for(int i=0;i<n;i++)
        {
            if(ar[i]==sum)
                count++;
        }
        System.out.println(count);
           }
}
