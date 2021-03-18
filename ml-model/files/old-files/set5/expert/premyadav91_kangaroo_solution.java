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
        return matchKangaroo(x1,v1,x2,v2);
     }
    static String matchKangaroo(int x1, int v1, int x2, int v2) {
        String match = "NO";
        if((x1>x2 && v1>v2) || (x1<x2 && v1<v2)){
            match = "NO";
        }else {
            double v = Math.abs(v1 - v2);
            double x = Math.abs(x1-x2);
            double time = (double)x/v;
        if(time % 1 == 0) {
            match = "YES";
        }else {
            match = "NO";
        }

        }
        return match;

    }

}
