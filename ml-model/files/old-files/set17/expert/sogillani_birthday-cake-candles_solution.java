import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int[] ar) {
        int max = 0;
        for (int i : ar) {
            if (i > max)
                max = i;
        }

        int count = 0;
        for (int i : ar) {
            if (i == max)
                count++;
        }

        return count;
    }

}
