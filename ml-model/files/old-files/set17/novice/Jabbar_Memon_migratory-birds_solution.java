import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class Solution {

    static int solve(int n, int[] types) {
        int[] frequencies = new int[6]; //A
        for (int i = 0; i < types.length; i++) { //B
            frequencies[types[i]] += 1; //C
        }
        int mostCommon = 0;
        for (int i = 1; i < frequencies.length; i++) { //D
            if (frequencies[mostCommon] < frequencies[i]) {
                mostCommon = i; //E
            }
        }
        System.out.println(mostCommon);
    }
}
