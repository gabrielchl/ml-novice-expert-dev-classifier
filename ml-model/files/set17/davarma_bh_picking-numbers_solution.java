import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int solve(List<Integer> a) {
        Collections.sort(a);
        int start = 0;
        int i = 0;
        int max = 0;
        while(i < a.size()){
            if(Math.abs(a.get(start) - a.get(i)) > 1){
                start = i;
            }
            max = Math.max(max, i - start + 1);
            i++;
        }
        i--;
        return Math.max(max, i - start + 1);
    }

}
