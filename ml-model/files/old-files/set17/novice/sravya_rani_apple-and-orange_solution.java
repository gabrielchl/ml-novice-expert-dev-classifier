import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int a1=apples.length;
        int i,ac=0,oc=0;
        int o1=oranges.length;
        for(i=0;i<a1;i++)
        {
            int l=apples[i];
            l=a+l;
            if(l>=s && l<=t)
                ac++;
        }
        for(i=0;i<o1;i++)
        {
            int l=oranges[i];
            l=b+l;
            if(l>=s && l<=t)
                oc++;
        }
        System.out.println(ac);
        System.out.println(oc);


    }

}
