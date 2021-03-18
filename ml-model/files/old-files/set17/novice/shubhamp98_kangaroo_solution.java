import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        if(v2 < v1) {
            for(int i = 0; i < 10000; i++) {
                if(x2 == x1) {
                    return "YES";
                }
                else {
                    x1 += v1;
                    x2 += v2;
                }
            }
            return "NO";
        }
        else
            return "NO";

    }

}
