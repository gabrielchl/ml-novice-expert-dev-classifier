import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;
public class Solution {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int returnArr[] = new int[p.length], count = 0;
        for(int i = 0; i < p.length; i++){
            int firstPlace = findIndex(p, i+1) + 1;
            returnArr[count++] = findIndex(p, firstPlace) + 1;
        }
        return returnArr;
    }
    static int findIndex(int arr[], int num){
        return IntStream.range(0, arr.length)
                .filter(x -> arr[x] == num)
                .findFirst()
                .orElse(-1);
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
