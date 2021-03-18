import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] c) {
        int x=0;
        for(int i=0;i<n-1;i++){
            if(c[i]==0)continue;
            for(int j=i+1;j<n;j++){
                if(c[i]==c[j]){
                    c[j]=0;x++;break;

                }
            }
        }
        System.out.println(x);
    }
}
