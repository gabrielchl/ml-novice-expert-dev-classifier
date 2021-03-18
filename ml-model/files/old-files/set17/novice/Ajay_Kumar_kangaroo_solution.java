import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {

        if((x1<x2 && v1<v2) || (x1>x2 && v1>v2)) return "NO";
         else if((x1<x2 && v1==v2) || (x1>x2 && v1==v2)) return "NO";
        else {
            int i=3,
                d1 = Math.abs((x1 + v1) - (x2 +v2)),
                d2 = Math.abs((x1 + v1+v1) - (x2 +v2+v2));
                while(d2<=d1){
                    if(d2 == 0) return "YES";
                    d1 = d2;
                    d2 = Math.abs((x1 + i*v1) - (x2 + i*v2));
                    i++;
                }
                return "NO";

        }


    }

}
