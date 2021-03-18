import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar) {
        int a=0;
        for(int i=0;i<=ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[j]!='t'){
                    if(ar[i]==ar[j]){
                        a++;
                        ar[j]='t';
                        break;
                    }
                }
            }
        }
        System.out.println(a);
        return a;
    }

}
