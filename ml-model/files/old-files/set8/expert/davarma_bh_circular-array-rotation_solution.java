import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
       int k = input.nextInt() % n;
       int q = input.nextInt();
       int[] a = new int[n];
       for(int i = 0 ; i < n ; i++){
           a[i] = input.nextInt();
       }
       for(int i = 0 ; i < q ; i++){
           int m = input.nextInt();
           if(m - k >= 0){
               System.out.println(a[m-k]);
           }
           else{
               System.out.println(a[n+(m-k)]);
           }
       }
    }
}
