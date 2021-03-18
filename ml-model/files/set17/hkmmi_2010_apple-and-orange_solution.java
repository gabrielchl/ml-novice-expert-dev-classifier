import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

   static void solve(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int applesCounter = 0;
        int orangesCounter = 0;

        for (int i = 0; i < apples.length; i++) {
            int distance = apples[i] + a;
            if(distance >= s && distance <= t) {
                applesCounter++;
            }
        }

        for (int i = 0; i < oranges.length; i++) {
            int distance = oranges[i] + b;
            if(distance >= s && distance <= t) {
                orangesCounter++;
            }
        }

        System.out.println(applesCounter);
        System.out.println(orangesCounter);
    }

}
