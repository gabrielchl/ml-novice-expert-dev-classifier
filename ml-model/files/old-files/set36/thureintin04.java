import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        int length = p.length;
        for (int k = 1; k <= length; k++) {
            final int i = k;
            int px = IntStream.range(0, length)
                    .filter(j -> i == p[j])
                    .findFirst()
                    .orElse(-1) + 1;

            System.out.println("x : " + px);
            int py = IntStream.range(0, length)
                    .filter(j -> px == p[j])
                    .findFirst()
                    .orElse(-1);

            System.out.println("y : " + py);
            result[i - 1] = py + 1;
        }
        return result;
    }

}
