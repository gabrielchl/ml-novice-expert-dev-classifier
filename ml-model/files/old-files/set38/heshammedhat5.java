import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] indexOf = new int[p.length];
        int[] result = new int[p.length];

        for (int i = 0; i < p.length; i++) {
            indexOf[p[i] - 1] = i;
        }
        for (int x = 0; x < p.length; x++) {
            result[x] = indexOf[indexOf[x]] + 1;
        }

        return result;
    }

}
