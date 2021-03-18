import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar) {
        int a[]=new int[101];
        for(int i=0;i<ar.length;i++){
            a[ar[i]]++;
        }
        int pairs=0;
        for(int i=1;i<=100;i++){
           // if(a[i]%2!=0)
           // {
                pairs+=(a[i]/2);
           // }
        }
        return pairs;


    }

}
