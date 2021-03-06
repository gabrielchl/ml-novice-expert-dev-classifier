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

        int n = p.length;
        int[] ar = new int[n+1];
        int[] res = new int[n];
        ar[0] = 0;
        int s =0 ;
        for(int i=1; i<=n; i++)
        {
            ar[i] = p[i-1];
        }

        for(int j=1; j<=n; j++)
        {
            for(int k=1; k<=n; k++)
            {
                if(ar[k]==j)
                {
                    for(int l=1; l<=n; l++)
                    {
                        if(ar[l]==k)
                        {
                            res[s] = l ;
                            s++;
                            break;
                        }
                    }
                }
            }
        }
        return res;




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
