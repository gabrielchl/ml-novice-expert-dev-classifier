import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {

        int startDiff = 0;
        int stepDiff = 0;

        if (x1 == x2 && v1 == v2) {
            return "YES";
        } else if(x1 > x2) {
            startDiff = x1-x2;
            stepDiff = v1-v2;
        } else {
            startDiff = x2-x1;
            stepDiff = v2-v1;
        }

        if (stepDiff >= 0) {

         return "NO";

        } else {

            int stepAfterTheyMeat = startDiff % stepDiff;

            if(stepAfterTheyMeat == 0) return "YES";
            else return "NO";

        }

    }

}
