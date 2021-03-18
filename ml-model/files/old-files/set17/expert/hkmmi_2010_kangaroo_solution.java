import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        String solution = "YES";

        int currentLocation1 = x1;
        int currentLocation2 = x2;

        while (currentLocation1 != currentLocation2) {
            currentLocation1 += v1;
            currentLocation2 += v2;
            if (currentLocation1 > 10000000 || currentLocation2 > 10000000) {
                solution = "NO";
                break;
            }
        }

        return solution;

    }

}
