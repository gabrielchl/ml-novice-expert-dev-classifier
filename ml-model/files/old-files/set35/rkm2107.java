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
        int f[]=new int[p.length];
        int arr[]=new int[p.length];
        int i=1;
        int m,j;
        while(i<p.length)
        {
            f[i]=p[p[i]];
            i++;
        }
        i=1;
        while(i<p.length)
        {
             m=i; j=1;
            while(j<p.length)
            {
                if(m==f[j])
                {
                    arr[i]=j;
                    break;
                }
                else
                    j++;
            }
            i++;
        }
         /*i=1;
        while(i<p.length)
        {
           System.out.print(arr[i]);
        i++;
        }*/
        return arr;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n+1];

        //String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 1; i <= n; i++) {
           
            p[i] = scanner.nextInt();
        }

        int[] result = permutationEquation(p);

        for (int i = 1; i <result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length ) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
