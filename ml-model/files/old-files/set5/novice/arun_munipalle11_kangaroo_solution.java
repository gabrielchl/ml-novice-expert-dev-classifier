import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {

        try{
                boolean mod = ((x2-x1)%(v1-v2)==0);
                int num= -(x1-x2)/(v1-v2);
                if(num<0 || !mod)
                    return "NO";

        }catch(ArithmeticException e)
        {
            return "NO";
        }


        return "YES";
    }
}
