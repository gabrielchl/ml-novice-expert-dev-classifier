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

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
int n[] = {0, 0, 0, 0, 0};

        for (Integer arrVal : arr) {
            switch (arrVal) {
                case 1:
                    n[0]++;
                    break;
                case 2:
                    n[1]++;
                    break;
                case 3:
                    n[2]++;
                    break;
                case 4:
                    n[3]++;
                    break;
                case 5:
                    n[4]++;
                    break;
                default:
                    break;
            }
        }
        int maxIndex = 0;
        int maxVal = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > maxVal) {
                maxIndex = i + 1;
                maxVal = n[i];
            }
        }
        return maxIndex;

    }

}
