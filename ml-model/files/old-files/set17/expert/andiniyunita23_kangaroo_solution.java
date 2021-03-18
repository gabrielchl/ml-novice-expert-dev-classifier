import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {

        int max = (v1 * v2);

        for (int i=0; i<max; i++) {
            int k1 = (i * v1) + x1;
            int k2 = (i * v2) + x2;

            if (k1 == k2) {
                return "YES";
            }else {
                if (i == (max-1)) {
                    return "NO";
                }
            }
        }

        return "NO";

    }

}
