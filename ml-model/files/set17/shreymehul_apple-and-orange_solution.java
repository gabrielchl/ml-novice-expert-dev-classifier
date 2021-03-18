import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int c=0;
        int d=0;
        int p= apples.length;
        int q= oranges.length;
        for(int i=0;i<p;i++){
            apples[i]=apples[i]+a;
            if(apples[i]>=s&&apples[i]<=t){
                c++;
            }
        }
        for(int i=0;i<q;i++){
            oranges[i]=oranges[i]+b;
            if(oranges[i]>=s&&oranges[i]<=t){
                d++;
            }
        }
        System.out.println(c);
        System.out.println(d);

    }

}
