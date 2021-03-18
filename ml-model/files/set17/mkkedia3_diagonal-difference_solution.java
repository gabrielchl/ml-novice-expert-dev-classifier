import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int solve(List<List<Integer>> arr) {
    int sum1=0,sum2=0;
    for(int i=0;i<arr.size();i++)
    {
        for(int j=0;j<arr.size();j++)
        {
            if(i==j)
            {
                sum1=sum1+arr.get(i).get(j);
                System.out.println("term1="+arr.get(i).get(j));
                System.out.println("sum1="+sum1);
            }
            if(i+j==arr.size()-1)
            {
                sum2=sum2+arr.get(i).get(j);
                System.out.println("term2="+arr.get(i).get(j));
                System.out.println("sum1="+sum1);
            }
        }
    }
    System.out.println("sum1="+sum1);
    System.out.println("sum2="+sum2);
    int diff=(sum1>=sum2)?(sum1-sum2):(sum2-sum1);
    return diff;
    }

}
