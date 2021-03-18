import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static String meetornot(int low,int lows,int high,int highs) {
    while(low != high)
    {
        low = low+lows;
        high = high+highs;
        if(low>high)
        {
            break;
        }
    }
    if(low==high)
    {
        return "YES";
    }
    else
    {
        return "NO";
    }
}
    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        if((x2>x1 && v2>v1)||(x1>x2 && v1>v2)){return "NO";}
        else
        {
            if(x1>x2)
            {
                String res = meetornot(x2,v2,x1,v1);
                return res;
            }
            else
            {
                 String res = meetornot(x1,v1,x2,v2);
                return res;
            }
        }
    }

}
