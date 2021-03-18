import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(List<Integer> arr) {
        int[]b=new int[6];
        int a,max=0,ans=0;
        for(int i=0;i<arr.size();i++){
            a=arr.get(i);
            b[a]++;
        }
        for(int j=1;j<6;j++){
            if(b[j]>max){
                max=b[j];
                ans=j;
            }
        }
        return ans;

    }

}
