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
       int s=0;
       int e=0;
       if(n==p)
       {
           s=0;
           e=0;
       }
       else
       {
     if(n%2==0)
     {
if(p%2==0)
{
    s=p/2;
    e=(n-p)/2;
    
}
else
{
    s=(p-1)/2;
    e=(n-(p-1))/2;
}}
else
{
    if(p%2==0)
    {
      s=p/2;
      e=(n-1-p)/2;
    }
    else
    {
        s=(p-1)/2;
        e=(n-1-p-1)/2;
    }
}}
     
     int res=Math.min(s,e);
     return res;
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
