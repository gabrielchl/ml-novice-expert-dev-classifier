import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
     /*
       n 5
       p 3
     */
    static int pageCount(int n, int p) {
        int pageCnt = 0;
        int diff = n-p;
        if(n % 2 == 0) {
            if(p == 1 || p == n)
                pageCnt = 0;
            // go from back
            else if(diff <= p) {
                for(int i = n-1; i > p; i -= 2) {
                    pageCnt++;
                } 
            }
            // go from front
            else {
                for(int i = 1; i < p;  i += 2) {
                    pageCnt++;
                } 
            }
        } else { // diff = 4, p = 3, n = 7
             if(p == 1 || p == n || p == n-1)
                pageCnt = 0;
            // go from back
            else if(diff <= p) {
                for(int i = n-1; i > p; i -= 2) {
                    pageCnt++;
                } 
            }
            // go from front
            else {
                for(int i = 1; i < p;  i += 2) {
                    pageCnt++;
                } 
            }
        }
        return pageCnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
