import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int[] k1 = new int[10000];
        int[] k2 = new int[10000];
        int start1 = x1;  
        int start2 = x2; 
        for (int i=0; i<2000; i++)
        {
            start1 = start1 + v1; 
            k1[i] = start1;    
        }    
        for (int j=0; j<2000; j++)
        {
            start2 = start2 + v2;
            k2[j] = start2; 
        }
        for (int k=0; k<2000; k++) 
        {
           if (k1[k] == k2[k] && k1[k] != 0) {
               System.out.println("match" +k1[k]);
               return ("YES"); 
           }         
        }
        return ("NO");    

/*       
        if (x2 > x1 && v2 > v1) 
            return ("NO");
        else 
            return ("YES");
*/        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
