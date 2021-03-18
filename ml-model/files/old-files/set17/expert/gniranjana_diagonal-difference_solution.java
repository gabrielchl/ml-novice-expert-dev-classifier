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

    public static int solve(List<List<Integer>> arr) {
       if (arr.size() ==0 || arr==null)
            return 0;
        int rdiag =0, ldiag=0;
        for (int i = 0 ; i < arr.size(); i++) {
            List tmp = arr.get(i);
            rdiag += (Integer)tmp.get(i);
            ldiag += (Integer) tmp.get(tmp.size()-i-1);
        }

        return Math.abs(rdiag-ldiag);
    }

}
