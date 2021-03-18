import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {

        int minCount=0;
        if (arr.size()==0) {
            return minCount;
        }
        int[] ar = new int[arr.size()];
        for (int i = 0; i < arr.size();i++) {
            ar[arr.get(i)] += 1;
        }

        int max = ar[0];
        int i=1;
        for (; i < ar.length;i++) {
            if(max < ar[i]) {
                max=ar[i];
                minCount =i;
            }
        }

        return minCount;

    }

}
