import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] ans = new int[p.length];
    int track = 1;
    int temp=0;
    while(track<=p.length){
        for(int i=0;i<p.length;i++){

            if(track==p[i]){
                temp=i+1;
            }
        }
        for(int j=0;j<p.length;j++){
            if(temp==p[j]){
                ans[track-1]=j+1;
            }
        }
        track++;
    }

    return ans;

    }

}
