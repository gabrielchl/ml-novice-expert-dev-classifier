import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int max=0;
    static int solve(int n, int[] ar) {
        // Complete this function
        int count=0;
        for(int r:ar)if(r==max)count++;
        return count;
    }

}
