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
            int countApple=0;
            int countOrange=0;
            for(int i=0;i<apples.length;i++)
            {
                apples[i]+=a;
            }
            for(int i=0;i<oranges.length;i++)
            {
                oranges[i]+=b;
            }
            for(int i=0;i<apples.length;i++)
            {
                if(apples[i]>=s &&apples[i]<=t)
                countApple++;
            }
            for(int i=0;i<oranges.length;i++)
            {
                if(oranges[i]>=s && oranges[i]<=t)
                countOrange++;
            }
            System.out.println(countApple);
            System.out.println(countOrange);

    }

}
