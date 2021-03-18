import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar) {

        int count=0;
       Arrays.sort(ar);

         int max=ar[n-1];
            for(int j = 0; j < ar.length; j++)
                if (ar[j]== max)
                 count ++;

         return count;

    }

}
