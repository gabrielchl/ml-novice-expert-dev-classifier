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

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr.add(arrItem);
        }

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
