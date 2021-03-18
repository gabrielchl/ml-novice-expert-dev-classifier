import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    static void solve(int[] a) {
    long  sum1,sum2,sum3,sum4,sum5;

    sum1=a[0]+a[1]+a[2]+a[3];
    sum2=a[0]+a[2]+a[3]+a[4];

    sum3=a[0]+a[1]+a[3]+a[4];
    sum4=a[0]+a[1]+a[2]+a[4];
    sum5=a[1]+a[2]+a[3]+a[4];

    if(sum1<=sum2 && sum1<=sum3 && sum1<=sum4 && sum1<=sum5 )
    {
        System.out.print(sum1);
    }
    else if(sum2<sum1 && sum2<sum3 && sum2<sum4 && sum2<sum5 )
    {
        System.out.print(sum2);
    }
        else if(sum3<sum1 && sum3<sum2 && sum3<sum4 && sum3<sum5 )
    {
        System.out.print(sum3);
    }
        else if(sum4<sum1 && sum4<sum2 && sum4<sum3 && sum4<sum5 )
    {
        System.out.print(sum4);
    }
        else if(sum5<sum1 && sum5<sum2 && sum5<sum3 && sum5<sum4 )
    {
        System.out.print(sum5);
    }

    if(sum1>=sum2 && sum1>=sum3 && sum1>=sum4 && sum1>=sum5 )
    {
        System.out.print(" "+sum1);
    }
        else if(sum2>sum1 && sum2>sum3 && sum2>sum4 && sum2>sum5 )
    {
        System.out.print(" "+sum2);
    }
        else if(sum3>sum1 && sum3>sum2 && sum3>sum4 && sum3>sum5 )
    {
        System.out.print(" "+sum3);
    }
        else if(sum4>sum1 && sum4>sum2 && sum4>sum3 && sum4>sum5 )
    {
        System.out.print(" "+sum4);
    }
        else if(sum5>sum1 && sum5>sum2 && sum5>sum3 && sum5>sum4 )
    {
        System.out.print(" "+sum5);
    }
    }
}
