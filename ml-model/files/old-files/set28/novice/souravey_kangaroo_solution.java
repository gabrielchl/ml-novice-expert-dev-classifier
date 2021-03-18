import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        int s1=x1,s2=x2,c=1,flag=1;
        if(x1>x2 && v1>v2)
            flag=0;
        if(x2>x1 && v2>v1)
            flag=0;
        if(x1==x2 && v1!=v2)
            flag=0;
        if(flag==1)
        {
        do
        {
            s1=s1+v1;
            s2=s2+v2;
            if(x1<x2)
            {
                if(s1>s2)
                {
                    flag=0;
                    break;
                }
            }
            if(x1>x2)
            {
                if(s1<s2)
                {
                    flag=0;
                    break;
                }
            }
        }
        while(s1!=s2);
        }
        if(flag==1)
            return "YES";
        else
            return "NO";
    }

}
