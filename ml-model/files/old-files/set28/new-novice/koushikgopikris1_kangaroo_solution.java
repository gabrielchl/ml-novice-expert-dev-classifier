import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        String r1="YES";
        String r2="NO";
        int i=x1;
        int j=x2;
        int a=0;
        int b=0;
        int ac=0;
        int bc=0;

        if((i>j)&&(v1>v2))
        {
            return r2;
        }
        else if((j>i)&&(v2>v1))
        {
            return r2;
        }
        else{
            if(i>j)
            {
                a=i; b=j; ac=v1; bc=v2;
            }
            else{
                b=i; a=j; bc=v1; ac=v2;
            }
            while(a>b)
            {
                a=a+ac;
                b=b+bc;
            }
        }
        if(a==b){
            return r1;
        }
        else{
            return r2;
        }
    }

}
