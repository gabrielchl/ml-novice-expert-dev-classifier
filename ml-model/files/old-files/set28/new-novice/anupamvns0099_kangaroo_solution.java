import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        if((v1<v2 && x1<x2) || (v1>v2 && x1>x2))
        {
            return "NO";
        }
        else
        {
            int d1,d2,i=1;
            do
            {
                d1=(v1*i);
                d2=(v2*i)+(x2-x1);
                i++;
                if(d1==d2)
                {
                    return "YES";
                }
            }while(d1<=d2);
        }
        return "NO";
    }

}
