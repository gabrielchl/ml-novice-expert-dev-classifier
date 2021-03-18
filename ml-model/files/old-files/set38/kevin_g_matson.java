import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int find(int p, int[] ps) {
        for (int i = 0; i < ps.length; i++) {
            if (ps[i] == p)
                return i;
        }

        return -10;
    }

    static int[] permutationEquation(int[] p) {
        int[] ret = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            int x = find(i + 1, p) + 1;
            ret[i] = find(x, p) + 1;
        }

        return ret;
    }

}
