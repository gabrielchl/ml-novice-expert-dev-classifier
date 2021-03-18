import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int solve(int n, long[] a){
        long temp=0;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j] && a[i]!=0){
                    a[i]=temp;
                    a[j]=temp;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
