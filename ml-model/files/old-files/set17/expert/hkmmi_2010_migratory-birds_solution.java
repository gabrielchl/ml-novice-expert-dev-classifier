import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int solve(List<Integer> arr) {
       HashMap<Integer, Integer> s = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            int count = 1;
            if (s.containsKey(arr.get(i))) {
                count = s.get(arr.get(i)) + 1;
            }
            s.put(arr.get(i), count);
        }

        int solution = 0;

        Iterator<Integer> i = s.keySet().iterator();
        int maxNum = 0;
        while (i.hasNext()) {
            int currentIndex = i.next();
            int num = s.get(currentIndex);
            if (num > maxNum) {
                solution = currentIndex;
                maxNum = num;
            }
        }

        return solution;

    }

}
