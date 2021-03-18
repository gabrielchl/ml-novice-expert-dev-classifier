import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int[] arr) {
        int sum;
        List<Integer>l=new ArrayList();
        for(int i=0;i<arr.length;i++)
        {
             sum=0;
            for(int j=0;j<arr.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                else
                {
                    sum=sum+arr[j];
                }
            }
            l.add(sum);
        }
        System.out.print(Collections.min(l)+" "+Collections.max(l));

    }

}
