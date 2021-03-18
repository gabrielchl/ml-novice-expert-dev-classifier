import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        // K1's rate is less than or equal K2's, they will never meet
        if (v1 <= v2) {
            return "NO";
        }

        // if K1's current location is greater than K2's, they will never meet
        int curX1 = x1;
        int curX2 = x2;
        while (curX1 < curX2) {
            curX1 += v1;
            curX2 += v2;
        }

        if (curX1 == curX2) {
            return "YES";
        }
        return "NO";
    }

}
