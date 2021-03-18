import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static int solve(List<Integer> a) {
int max = 0;
        int count = 1;
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i) >= a.get(j) && Math.abs(a.get(i) - a.get(j)) <= 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
            count = 1;
        }
        for (int i = 0; i < a.size(); i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i) <= a.get(j) && Math.abs(a.get(i) - a.get(j)) <= 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
            count = 1;
        }
        return max;
    }

}
