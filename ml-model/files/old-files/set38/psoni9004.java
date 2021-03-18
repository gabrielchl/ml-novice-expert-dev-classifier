import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {

        // 2 3 1  // p1 p2 p3
        // p(p(y))
        int n = p.length;
        int res[] = new int[n+1];
        int finRes[] = new int[n];
        for(int i = 1; i <= n ; i++){
            res[p[i-1]] = i;
        }
        for(int j= 1 ; j <= n ; j ++){
               finRes[j-1] =  res[res[j]];
        }

        return finRes;
    }

}
