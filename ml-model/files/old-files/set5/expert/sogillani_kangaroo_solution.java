import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {

        long k1Pos = x1, k2Pos = x2;

        if (v1 > v2) {
            while (k2Pos >= k1Pos) {
                if (k1Pos == k2Pos) {
                    return "YES";
                }
                k1Pos += v1;
                k2Pos += v2;
            }
        } else if (v2 > v1) {
            while (k1Pos > k2Pos) {
                if (k1Pos == k2Pos) {
                    return "YES";
                }
                k1Pos += v1;
                k2Pos += v2;
            }
        }

        return "NO";
    }
}
