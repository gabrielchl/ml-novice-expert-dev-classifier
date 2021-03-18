import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 5;
    long min, max;
    long sum;
    long[] arr = new long[size];
    long a = in.nextLong();
    arr[0] = min = max = sum = a;
    for(int i = 1; i < size; i++) {
        a = in.nextLong();
        if(min > a) {
            min = a;
        }
        if(max < a) {
            max = a;
        }
        sum += a;
    }
    System.out.print((sum-max) + " " + (sum-min));
    }
}
