import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] arr) {
    int n = arr.length;
    int[] res = new int[n];
    Map<Integer,Integer> hm = new TreeMap<Integer,Integer>();
    for(int i=0;i<n;i++)
        hm.put(arr[i],i+1);
    Map<Integer,Integer> hm1 = new TreeMap<Integer,Integer>();    
    for(Map.Entry<Integer,Integer> e : hm.entrySet())
    {
        hm1.put(e.getKey(),hm.get(e.getValue()));
    }
    int i = 0;
    for(Map.Entry<Integer,Integer> e : hm1.entrySet())
    {
        res[i++] = e.getValue();
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