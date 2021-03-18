import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static final String YES = "YES";
    static final String NO = "NO";

    static String solve(int x1, int v1, int x2, int v2)
    {
        if(x1==x2)
            return YES;

        String output = NO;

        int count = 1;
        long x1Multiple = x1;
        long x2Multiple = x2;
        while(x1Multiple< x2Multiple)
        {
            x1Multiple = x1 + (count * v1);
            x2Multiple = x2 + (count * v2);
            if(x1Multiple == x2Multiple)
            {
                output = YES;
                break;
            }
            count++;
        }
        return output;

    }

}
