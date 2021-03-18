import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import javax.lang.model.util.ElementScanner6;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2)
    {
        if((x1+v1)==(x2+v2))
        {return "YES";}
else if((x1>x2 && v1>v2)||(x2>x1 && v2>v1))
return "NO";


for(int i=2; i<=v1*v2; i++)
{
    if(x1+i*v1==x2+i*v2)
    return "YES";

}
return "NO";
    }

}
