import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
      String result = "";
        int a=0,b=0;
        boolean loopCheck = true;
        if((x1 < x2 && v1 < v2) || (x2 < x1 && v2 < v1)){
            result = "NO";
        }
        while(loopCheck){
            a = x1 + v1;
            b = x2 + v2;
            x1 = a;
            x2 = b;
            if(a == b){
                result = "YES";
                loopCheck = false;
            }
            if(a > b){
                result = "NO";
                loopCheck = false;
            }
        }

        return result;

    }

}
