import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) 
    {
        int temp= 0;
        int arr[][] = new int[p.length][2];
        for( int i = 0 ; i < p.length ; i++)
        { 
            arr[i][1] = i+1;
            arr[i][0] = p[i];
        }
        for( int i = 0 ; i < p.length ; i++)
        { 
            System.out.print(arr[i][1] +" ");
            System.out.println(arr[i][0] );
        }
        Arrays.sort(p);
        for( int i = 0 ; i < p.length ; i++)
        {   temp =0;
            //System.out.println(p[i]);
            for( int j = 0 ; j < p.length ; j++)
            {   
                if( p[i] == arr[j][0] )
                {
                    temp = arr[j][1];
                    System.out.println(arr[j][1]);
                }
            }
            p[i] = temp;
            //System.out.println(temp);  
        }
        for( int i = 0 ; i < p.length ; i++)
        {   temp =0;
            //System.out.println(p[i]);
            for( int j = 0 ; j < p.length ; j++)
            {   
                if( p[i] == arr[j][0] )
                {
                    temp = arr[j][1];
                    System.out.println(arr[j][0]);
                }
            }
            p[i] = temp;
            //System.out.println(temp);  
        }

        return p;



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
