import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        // x1 + v1 * t = x2 + v2 * t
        // x1 - x2 = (v2 - v1) * t
        // t = x1 - x2 / v2 - v1
        // t must be integer
        double t = (double)(x1 - x2) / (double)(v2 - v1);
        if (t >= 0 && t == Math.floor(t)) {
            return "YES";
        }
        return "NO";
    }

}
