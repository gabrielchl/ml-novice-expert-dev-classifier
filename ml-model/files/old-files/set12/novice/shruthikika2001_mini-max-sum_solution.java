import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr)
     {
         long max=0 ,min=0;
         for(int i=0;i<arr.length;i++)
         {
             for(int j=0;j<arr.length-1-i;j++)
             {
                 if(arr[j+1]<arr[j])
                 {
                     int t=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=t;
                 }
             }
         }
         for(int i=0;i<4;i++)
         min+=arr[i];
         for (int i = arr.length-1; i >=arr.length-4; i--)
            max += arr[i];
        System.out.print(min+ " "+max);



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
