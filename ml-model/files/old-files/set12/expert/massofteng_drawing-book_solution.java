import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int i,count=0;
        if(n-p==1 || n-p==0 || p==1){
            count= 0;
            return count;
        }
       for(i=1;i<n;i++){
           if(i==p ){
               count= i;
               return count;
           }else if(i==p-1){
               count= i;
               return count; 
           }
           else{
               i++;
               p--;
               if(i==p){
                    i--;
                    count= i;
                    return count;
               }
           }
       }
       return count;
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
