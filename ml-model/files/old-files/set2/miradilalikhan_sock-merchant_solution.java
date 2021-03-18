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
        int result=0;
      HashMap<Integer, Integer> sockColor = new HashMap<Integer,Integer>();
      for(int i=0; i<ar.length; i++){
          int sockValue= (sockColor.containsKey(ar[i]))?sockColor.get(ar[i]):0;
          sockValue++;
          sockColor.put(ar[i],sockValue);
      }
      for(Map.Entry<Integer,Integer> map : sockColor.entrySet()){
          result+=(map.getValue()/2);
      }
    //   System.out.println(sockColor.get(1)/2);
    //   System.out.println(sockColor.get(2)/2);
    //   System.out.println(sockColor.get(3)/2);
    //   System.out.println(sockColor.get(5)/2);
    //   System.out.println(sockColor.get(6)/2);
return result;
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
