import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        int jump=0;
        if(x1>x2){
            //jump=(x1-x2)/(v2-v1)
            if((v2-v1)>0 && (x1-x2)%(v2-v1)==0)
            return "YES";
            else
            return "NO";
        }
        else
        {
            if((v1-v2)>0 && (x2-x1)%(v1-v2)==0)
            return "YES";
            else
            return "NO";
        }

    }

}
