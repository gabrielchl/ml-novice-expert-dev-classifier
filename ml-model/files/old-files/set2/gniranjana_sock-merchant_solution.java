import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
           int sockPairs = 0;
        if (n <=0 ) return sockPairs;
        
        HashMap<Integer, Integer> arrMap = new HashMap<Integer, Integer>();
        for (int i = 0 ; i < ar.length ; i++){
            if(arrMap.get(ar[i]) == null){
                Integer sockCount = 0;
                arrMap.put(ar[i],++sockCount);
            }
            else if (arrMap.get(ar[i]) == 1){
                arrMap.put(ar[i],null);
                sockPairs++;
            }
            else if (arrMap.get(ar[i]) == 2){
                sockPairs++;
                Integer sockCount = arrMap.get(ar[i]);
                arrMap.put(ar[i],sockCount-2+1);
            }
        }
        return sockPairs;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
