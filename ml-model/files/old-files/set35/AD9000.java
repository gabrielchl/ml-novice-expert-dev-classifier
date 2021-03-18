import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    static int[] permute(int p[])
    {
        int y[] = new int[p.length];
        for (int i = 0; i < p.length; i++)
        {
            y[p[i] - 1] = i + 1;
        }
        return y;
    }

    static int[] permutationEquation(int[] p) {        
        p = permute(p); 
        int y[] = new int[p.length];
        for (int i = 0; i < p.length; i++)
        {
            y[i] = p[p[i] - 1];
        }
        return y;
    }

    /*
    2
5
11
13
1
14
7
3
4
18
8
6
16
12
15
10
9
17*/

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
