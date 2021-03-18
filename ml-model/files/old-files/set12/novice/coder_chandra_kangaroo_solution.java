import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args)
{
    Scanner in = new Scanner(System.in);
    int x1 = in.nextInt();
    int v1 = in.nextInt();
    int x2 = in.nextInt();
    int v2 = in.nextInt();
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
