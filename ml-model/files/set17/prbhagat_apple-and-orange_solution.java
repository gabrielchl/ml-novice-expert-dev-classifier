import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int apct =0;
        int orct = 0;
        for (int i = 0; i < apples.length;i++)
        {
            if ( (a + apples[i]) >= s) apct++;
        }
        for (int i = 0; i < oranges.length;i++)
        {
            if ( (b + oranges[i]) <= t) orct++;
        }
        System.out.println(+apct);
        System.out.println(+orct);
    }

}
