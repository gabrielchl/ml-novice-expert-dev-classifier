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
        Map<Integer, Integer> birdMap = new TreeMap<>();
        birdMap.put(1, 0);
        birdMap.put(2, 0);
        birdMap.put(3, 0);
        birdMap.put(4, 0);
        birdMap.put(5, 0);

        for(Integer i : arr) {
            birdMap.put(i, birdMap.get(i)+1);
        }
        int birdIndex = -1;
        int birdCount = 0;
        for(Map.Entry<Integer, Integer> entry : birdMap.entrySet()) {
            if (entry.getValue() > birdCount) {
                birdCount = entry.getValue();
                birdIndex = entry.getKey();
            }
        }

        return birdIndex;

    }

}
