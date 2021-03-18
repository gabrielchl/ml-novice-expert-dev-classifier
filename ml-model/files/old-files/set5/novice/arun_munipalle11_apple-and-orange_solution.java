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
            int ac=0,oc=0;
            for(int i=0;i<apples.length;i++)
            {
                int num = apples[i]+a;
                if(num>=s && num<=t)
                {
                    ac++;
                }
            }
            for(int j=0;j<oranges.length;j++)
            {
                int num = oranges[j]+b;
                if(num>=s && num<=t)
                {
                    oc++;
                }
            }
            System.out.println(ac+"\n"+oc);


    }

}
