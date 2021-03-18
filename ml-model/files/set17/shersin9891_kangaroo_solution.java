import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int a, int b, int c, int d) {
        if(b-d ==0) {
            return "NO";
        }
        int n = (c-d+b-a)/(b-d);
         int i = (c-d+b-a)%((b-d));
        if(n>0&&i==0){
            return "YES";
        }
        return "NO";


    }

}
