import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  private static String solve(int x1, int v1, int x2, int v2)
{
    int c=0;
    int k1 = x1;
    int k2 = x2;
    if(x2>x1&&v2>v1)
    System.out.print("NO");
    else
    {
        for(int i=0;i<10000;i++)
        {
            k1+=v1;
            k2+=v2;
            if(k1==k2)
            {
                c++;
                break;
            }
        }
    if(c!=0)
        System.out.print("YES");
    else
        System.out.print("NO");
    }
}
}
