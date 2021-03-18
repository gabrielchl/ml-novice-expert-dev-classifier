import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int s, int t, int a, int o, int[] apples, int[] oranges) {
        int appleCount = 0, orangeCount = 0;
        int numOfApples = (apples.length);
        int numOfOrange = (oranges.length);
        //int total = (numOfApples+numOfOrange);

        //System.out.println("AppleCount " + numOfApples + " OrangeCount " + numOfOrange);

        for(int i = 0; i < numOfApples; i++) {
            if(apples[i] + a >= s && apples[i] + a <= t)
                    appleCount++;
        }
        for(int i = 0; i < numOfOrange; i++) {
                if(oranges[i] + o >= s && oranges[i] + o <= t)
                    orangeCount++;
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);


    }

}
