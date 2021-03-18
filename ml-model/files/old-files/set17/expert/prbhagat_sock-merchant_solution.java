import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar) {
        int length = ar.length;
        int[] pair = new int[length];
        int paircnt = 0;
        int stock = 0;
        int mismatch = 0;
        int even = 0;
        Arrays.sort(ar);
//        System.out.println(Arrays.toString(ar));
        for (int i=0; i < ar.length; i++){
        even = i%2;
//       System.out.println("even"+even);
//           System.out.println("i ->"+i +"Value "+ar[i]);
           if (i >0 && even == 1 ) {
            if (ar[i-1] == ar[i]){
                pair[paircnt] = ar[i];
                paircnt++;
//                System.out.println("Match"+ar[i]);
                i++;
            }
            }
          }
 //       System.out.println("Pairs"+paircnt);
        return paircnt;
    }

}
