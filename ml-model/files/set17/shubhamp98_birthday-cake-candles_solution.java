import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(int[] ar) {
        int max, count = 0;
        max = ar[0];
        for(int i = 1; i < ar.length; i++) {
            if(max < ar[i]) {
                max = ar[i];
            }
        }
        for(int i = 0; i < ar.length; i++) {
            if(max == ar[i])
                count++;
        }
        System.out.println(count);

        return count;

    }

}
