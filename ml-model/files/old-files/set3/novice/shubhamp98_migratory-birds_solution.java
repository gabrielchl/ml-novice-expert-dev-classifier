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
        int arrSize = arr.size();
        // Counts of each number
        // 0 = No.1, 1 = No.2, --- 4 = No.5
        int[] count = {0, 0, 0, 0, 0};
        // last updated index of each number
        // 0 = No.1, 1 = No.2, --- 4 = No.5
        int[] lastIdx = {0, 0, 0, 0, 0};
        for(int i = 0; i < arrSize; i++) {
            if(arr.get(i) == 1) {
                count[0]++;
                lastIdx[0] = i;
            }
            else if(arr.get(i) == 2) {
                count[1]++;
                lastIdx[1] = i;
            }
            else if(arr.get(i) == 3) {
                count[2]++;
                lastIdx[2] = i;
            }
            else if(arr.get(i) == 4) {
                count[3]++;
                lastIdx[3] = i;
            }
            else {
                count[4]++;
                lastIdx[4] = i;
            }
        }

        int maxCount = count[0];
        int finalIdx = 0;

        //System.out.println(Arrays.toString(count));
        /*
        6
        1 4 4 4 5 3

        [1, 0, 1, 3, 1]
        */
        for(int i = 1; i < count.length; i++) { 
            if(maxCount < count[i]) {
                finalIdx = i;
                maxCount = count[i];
            }
        }
        

        return ++finalIdx;


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
