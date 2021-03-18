import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int[] ar) {
         Arrays.sort(ar);
         int count = 0,temp = ar[ar.length-1];
         int i = ar.length-1;
         while(ar[i]==temp){
            if(ar[i] == temp)
            count++;
            else break;
            i--;
         }
         return count;

    }

}
