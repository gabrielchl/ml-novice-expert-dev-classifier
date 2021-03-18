import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static final String YES = "YES";
    static final String NO = "NO";

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) 
    {
        if(x1==x2)
            return YES;

        String output = NO;

        int count = 1;
        long x1Multiple = x1;
        long x2Multiple = x2;
        while(x1Multiple< x2Multiple)
        {
            x1Multiple = x1 + (count * v1);
            x2Multiple = x2 + (count * v2);
            if(x1Multiple == x2Multiple)
            {
                output = YES;
                break;
            }
            count++;
        }
        return output;

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
