import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int ocount=0;
        int acount=0;
        for(int i = 0 ;i<apples.length ; i++){
            if(a + apples[i]>=s && a+apples[i]<=t)
            acount++;
        }
        for(int i = 0;i<oranges.length;i++){
            if(b+oranges[i]<=t && b+oranges[i]>=s)
            ocount++;
        }
        System.out.println(acount);
        System.out.println(ocount);


    }

}
