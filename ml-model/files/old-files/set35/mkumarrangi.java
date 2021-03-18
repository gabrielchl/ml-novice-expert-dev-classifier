import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int arr[]=new int[p.length];
        for(int i=0;i<p.length;i++)
        {
            arr[i]=p[i];
        }
        Arrays.sort(arr);
        int arrnk[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<p.length;j++)
            {
                if(arr[i]==p[j])
                {
                    arrnk[i]=j+1;
                }
            }
        }
        int arrpk[]=new int[arr.length];
        for(int i=0;i<arrnk.length;i++)
        {
            for(int j=0;j<p.length;j++)
            {
                if(arrnk[i]==p[j])
                {
                    arrpk[i]=j+1;
                }
            }
        }

    return arrpk;
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
