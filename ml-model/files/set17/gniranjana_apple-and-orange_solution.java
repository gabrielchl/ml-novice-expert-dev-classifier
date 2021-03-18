import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int s, int t, int a, int b, int[] apples, int[] oranges) {

if(s==0 || t==0)
            return;

        int appleCount =0 , orangeCount=0;
        for (int i = 0; i <= apples.length-1; i++) {
            if(apples[i] + a >= s && apples[i]+a <= t) {
                appleCount++;
            }
        }
        for (int i = 0; i <= oranges.length-1; i++) {
            if(oranges[i] + b >= s && oranges[i]+b <= t) {
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

}
