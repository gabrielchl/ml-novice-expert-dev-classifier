import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int rot = k % a.length;
        int firstPos = a.length - rot;
        int newArPos = 0;
        int[] ar = new int[a.length];
        for (int j = firstPos; j< a.length; j++) {
            ar[newArPos] = a[j];
            newArPos++;
        }
        for (int t = 0; t < firstPos;t++) {
            ar[newArPos] = a[t];
            newArPos++;
        }
        for (int m = 0;m<ar.length;m++) {
            System.out.println("ar = "+ m + " = "+ar[m]);
        }
        int[] newArr = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int pos = queries[i];
            // int act = 0;
            // int mainPos = pos+firstPos;
            // if (mainPos >= a.length) {
            //     act = a.length-mainPos;
            // } else {
            //     act = mainPos;
            // }
            newArr[i] = ar[pos];
        }   
        return newArr;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);

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
