import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static int solve(List<List<Integer>> arr) {
    int length = arr.size();
    int width = arr.get(0).size();
    int rlsum = 0;
    int lrsum = 0;
    // Right to left
    for (int i = 0; i < length; i++) {
        for (int j =0; j < width ; j++) {
        //System.out.println("RL Elements" + arr.get(i).get(j));
        if (i == j) {
            rlsum += arr.get(i).get(j);
        //    System.out.println("rlsum" +arr.get(i).get(j));
        }
        if ( (i+j) == (length-1)) {
            lrsum += arr.get(i).get(j);
        //    System.out.println("lrsum"+arr.get(i).get(j));
        }
    }
    }
    return Math.abs(rlsum - lrsum);
}
}
