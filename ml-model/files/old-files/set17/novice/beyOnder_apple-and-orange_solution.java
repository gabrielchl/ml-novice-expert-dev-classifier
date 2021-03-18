import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int p=0,q=0;
         for(int i=0;i<apples.length;i++){
             apples[i]+=a;
             if(apples[i]>=s&&apples[i]<=t){
                 p++;
             }
         }
         for(int j=0;j<oranges.length;j++){
             oranges[j]+=b;
             if(oranges[j]>=s&&oranges[j]<=t){
                 q++;
             }
         }
         System.out.println(p);
         System.out.println(q);


    }

}
