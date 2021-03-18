import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class Solution {

    static int solve(int[] ar) {
        Arrays.sort(ar);
        int count =1;
        for (int i= ar.length -1 ; i > 0 ;i--)
        {
            if (ar[i] == ar[i-1]) count++;
            else break;
        }
        return count;
    }

}
