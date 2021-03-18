import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) { // 2 3 1
        int arrSize = p.length;
        int[] retArr = new int[arrSize];
        int[] temp = new int[arrSize];
        int x = 1, xIdx = -1, xIdxAt = -1, a = 0;
        while(a < arrSize) {
            for(int i = 0; i < arrSize; i++) {
                if(x == p[i]) {
                    x++;
                    xIdx = i+1;
                    break;
                }
            }
            for(int i = 0; i < arrSize; i++) {
                if(xIdx == p[i]) {
                    xIdxAt = i;
                    break;
                }
            }
            temp[a] = ++xIdxAt;
            a++;
        }
        return temp;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
