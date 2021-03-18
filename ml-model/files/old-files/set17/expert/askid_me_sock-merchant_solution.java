import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] ar) {
 int pairs = 0;
        for (int i = 0; i < n; i++) {
            if(ar[i]==0) continue;
            for (int j = i + 1; j < n; j++) {
                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[j] = 0;
                    break;
                }
            }
        }
        return pairs;

    }

}
