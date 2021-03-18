import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String solve(int x1, int v1, int x2, int v2) {
        int a = (x1-x2);
        int b = (v2-v1);

        if(b == 0) {
            return "NO";
        }

        return (a%b == 0 && a/b >= 0)?"YES":"NO";
    }

}
