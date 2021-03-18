import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void solve(int n, int[] ar) {
    int i=0,j;
    int max=0;
    while(i<n){
        int c=0;
    for(j=0;j<n;j++){
        if((ar[i]==ar[j]+1)||ar[j]==ar[i])
        c++;
    }
    if(c>max)
    max=c;
    i++;
    }
    System.out.println(max);
    }
}
