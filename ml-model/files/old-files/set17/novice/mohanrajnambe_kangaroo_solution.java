import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        int a=x1+v1;
        int b=x2+v2;
        while(a<=b){
            if(a==b){
                return "YES";
            }else{
                a+=v1;
                b+=v2;
            }
        }
        return "NO";
    }

}
