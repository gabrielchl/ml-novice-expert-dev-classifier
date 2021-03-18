import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int solve(int n, int[] ar){

        int ans[] = new int[5];

        for(int i = 0;i<n;i++){
            (ans[(ar[i])-1])++;
        }

        int retval=-1, max = 0;
        for(int i = 0;i<5;i++){
           // System.out.println(ans[i]);
            if(ans[i]>max){
                max = ans[i];
                retval = i+1;
            }

        }
      return retval;

    }
}
