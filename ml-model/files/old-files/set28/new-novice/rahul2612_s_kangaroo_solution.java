import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    static String solve(int x1, int v1, int x2, int v2) {
        if(v1 < v2) return "NO";
        if(x1 < x2 && v1 > v2) {
            int xDiff = Math.abs(x1 - x2);
            int vDiff = Math.abs(v1 - v2);
            if(xDiff % vDiff == 0) {
                return "YES";
            } else {
                return "NO";
            }
        }
        return "NO";
    }
}
