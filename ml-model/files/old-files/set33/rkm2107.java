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
        int f=k%a.length;
        if(a.length>k)
        {
            if(k>(a.length/2))
            {
                int s=a.length-k;
                int b=1;
                while(b<=s)
                {
                    int p=a[a.length-1];
                    a[a.length-1]=a[0];
                    int i=0;
                    while(i<=a.length-3)
                    {
                        a[i]=a[i+1];
                        i++;
                    }
                    a[a.length-2]=p;
                    b++;
                }
            }
            else
            {
                int r=1;
                while(r<=k)
                {
                    int p= a[0];
                    a[0]=a[a.length-1];
                    int i=a.length-2;
                    while(i>=0)
                    {
                        a[i+1]=a[i];
                        i--;
                    }
                    a[1]=p;
                    r++;
                }
            }

        }
        else if(f==0)
        {
            int i=0;
        }
        else
        {
             int r=1;
             while(r<=f)
            {
                int p= a[0];
                a[0]=a[a.length-1];
                int i=a.length-2;
                while(i>=0)
                {
                    a[i+1]=a[i];
                    i--;
                }
                a[1]=p;
                r++;
            }
        }
        int arr[]=new int[queries.length];
        int i=0;
        while(i<queries.length)
        {
            int m=queries[i];
            arr[i]=a[m];
            i++;
        }
        return arr;

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
