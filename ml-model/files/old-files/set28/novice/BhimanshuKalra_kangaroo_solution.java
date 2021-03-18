import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        int count=0;
        for(int i=0;i<100000;i++)
        {
            if(x1==x2)
                count=1;
            x1+=v1;
            x2+=v2;
        }
        if(count==0)
            return "NO";
        else
            return "YES";


    }

}
