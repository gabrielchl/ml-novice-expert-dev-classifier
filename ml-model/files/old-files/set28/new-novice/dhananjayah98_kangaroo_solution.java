import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        String s=" ";
        long a=(x1*v2+x2*v1)/3;
for(int i=0;i<a;i++)
{
    if((x1>x2 && v1>=v2) || (x2>x1 && v2>=v1))
    {
        s="NO";
        break;

    }

    else if((x1+v1)==(x2+v2))
    {
       s="YES";
        break;

    }
    else {
        x1=x1+v1;
        x2=x2+v2;
    }
}
return s;
    }

}
