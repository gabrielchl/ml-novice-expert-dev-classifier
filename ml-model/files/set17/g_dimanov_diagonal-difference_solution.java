import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int solve(List<List<Integer>> arr) {
            int sum1 = 0;
        int sum2 = 0;
        int arrBorderIndex = arr.size() - 1;
        for(int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(arrBorderIndex - i);
        }
        int answer = sum1 - sum2;
        return Math.abs(answer);
    }

}
