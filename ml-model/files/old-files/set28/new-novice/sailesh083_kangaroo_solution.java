import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        if((x1<x2 && v1>v2)||(x1>x2 && v1<v2)){
            float t=(float)(((float)(x2)-(float)(x1))/((float)(v1)-(float)(v2)));
            float tp=t%1;
            if(tp==0.00000)
                return "YES";
            else
                return "NO";
            }
        else
            return "NO";
    }

}
