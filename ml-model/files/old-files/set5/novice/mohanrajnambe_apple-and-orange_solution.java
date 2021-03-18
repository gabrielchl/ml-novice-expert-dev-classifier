import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int count=0,count1=0;
        for(int i=0;i<apples.length;i++){
            if(a+apples[i]>=s && a+apples[i]<=t)
                count++;
        }
        for(int i=0;i<oranges.length;i++){
            if(b+oranges[i]<=t && b+oranges[i]>=s)
                count1++;
        }
        System.out.println(count);
        System.out.println(count1);

    }

}
