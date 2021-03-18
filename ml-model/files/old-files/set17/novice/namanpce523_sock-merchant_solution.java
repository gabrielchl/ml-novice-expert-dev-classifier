import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] c) {
        int count =0;
        for (int i=0;i< n ; i++){
            for (int j =1; j<n-1;j++){
                if(c[i]==c[j]){
                    count ++;
                    c[j]=0;
                }
            }
            System.out.println(count );
        }
    }
}
