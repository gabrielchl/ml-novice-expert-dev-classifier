

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int c1=0,c2=0;
        for(int i=0;i<apples.length;i++)
        {
            if(apples[i]>0 && (a+apples[i]>=s) && (a+apples[i]<=t))
            {
                c1++;
            }
        }
        for(int i=0;i<oranges.length;i++)
        {
            if(oranges[i]<0 && (b+oranges[i]>=s) && (b+oranges[i]<=t))
            {
                c2++;
            }
        }
        System.out.println(c1);
        System.out.println(c2);

    }

}
