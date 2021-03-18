import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int ans[] = new int[p.length];
        int m=0;
        for(int j=1;j<=p.length;j++){
            for(int i=0;i<p.length;i++){
                if(p[i]==j){
                    for(int l=0;l<p.length;l++){
                        if(p[l]==i+1){
                        ans[m]=l+1;
                        m++;
                        break;
                        }
                    }
                 }
            }
        }
        return ans;
    }

}
