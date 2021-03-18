import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void solve(int s, int t, int a, int b, int[] apples, int[] oranges)
    {
        int na=0,nb=0;
        for(int i=0;i<apples.length;i++)
        {
            if(s<=a+apples[i]&& t>=a+apples[i])
            {
             na++;
            }

        }
        for (int i = 0; i < oranges.length; i++) {
            if (s <= b+ oranges[i] && t >= b+ oranges[i]) {
                nb++;
            }

        }
        System.out.println(na+"\n"+nb);


    }

}
