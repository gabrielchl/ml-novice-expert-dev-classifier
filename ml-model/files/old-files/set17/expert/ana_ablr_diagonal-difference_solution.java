import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {

    public static int solve(List<List<Integer>> arr) {
    int d1 =0, d2=0;
    int n= arr.size();
    for(int i = 0; i<n;i++){
        for(int j = 0; j<n; j++){
            if(i==j){
                d1 += arr.get(i).get(j);
            }
            if (i == n - j - 1){
                d2 += arr.get(i).get(j);
            }

        }
    }

     return Math.abs(d1 - d2);

    }

}
