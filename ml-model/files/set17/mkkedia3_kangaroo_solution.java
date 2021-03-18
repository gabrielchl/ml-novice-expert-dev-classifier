import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        String s="";
        if(x1==x2 && v1!=v2)
            s="NO";
        else if(x1<x2 && v2>=v1)
            s="NO";
        else if(x2<x1 && v1>=v2)
            s="NO";
        else
        {
            if(v2>v1 && x1>x2)
            {
                while((x1-x2)>0)
                {
                    x1=x1+v1;
                    x2=x2+v2;
                }
                if(x1==x2)
                    s="YES";
                else
                    s="NO";
            }
            if(v1>v2 && x2>x1)
            {
                while((x2-x1)>0)
                {
                    x1=x1+v1;
                    x2=x2+v2;
                }
                if(x1==x2)
                    s="YES";
                else
                    s="NO";
            }
        }
        return s;
    }

}
