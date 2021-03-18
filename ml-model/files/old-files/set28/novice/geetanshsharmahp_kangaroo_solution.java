import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Solution
{
    private static String solve(int x1, int v1, int x2, int v2)
    {
     /*   if(x2>x1 && v2>v1)
        {
            System.out.println("No");
        }
        else
        {*/
            for(int i=0;i<1000;i++)
            {
                x1=x1+v1;
                x2=x2+v2;
                if(x1==x2)
                {
                    System.out.println("YES");
                    System.exit(0);
                }
            }
            System.out.println("NO");
        }

    }
