import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int acount=0;
        int ocount=0;
        for(int i=0;i<apples.length;i++){
            int apple = apples[i];
            apple = a+apple;
            if(apple>=s && apple<=t){
               acount++;
            }
        }
        for(int i=0;i<oranges.length;i++){
            int orange = oranges[i];
            orange = b+orange;
            if(orange>=s && orange<=t){
               ocount++;
            }
        }
        System.out.println(acount);
        System.out.println(ocount);
    }

}
