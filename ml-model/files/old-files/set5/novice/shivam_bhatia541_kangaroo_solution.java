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
        int c=0;
        while(x1<=x2){
            x1=x1+v1;
            x2=x2+v2;
            if(x2==x1)
            {
                c=1;
                break;
            }
        }

        if(c==0)
        return "NO";
        else
        return "YES";
    }

}
