import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] c) {
        Arrays.sort(c);
        int t=0;
        for (int i=0;i<n-1;i++){
            if(c[i]==c[i+1]){
                t++;
                i++;
            }
        }
        System.out.println(t);
    }
}
