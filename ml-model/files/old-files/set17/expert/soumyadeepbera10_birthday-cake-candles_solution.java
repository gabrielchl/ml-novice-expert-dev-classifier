import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int[] ar) {
       int temp;
        int count=1;
        int[] final1;
      Arrays.sort(ar);
    for(int i=ar.length-1;i>=0;i--)
     {
        for(int j=i-1;j>=0;j--){
        if(ar[i]==ar[j]){
            count++;
        }
        }
        break;
     }
     return count;

    }

}
