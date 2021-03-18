   /* import java.io.*;
    import java.math.*;
    import java.security.*;
    import java.text.*;
    import java.util.*;
    import java.util.concurrent.*;
    import java.util.regex.*;

    public class a
    {
        public static void main (String s[])
        { 
            long app_count=0;
            long org_count=0;
            Scanner sc=new Scanner(System.in);
            long start_point=sc.nextInt();
            long end_point=sc.nextInt();
            long dist_of_apple_tree=sc.nextLong();
            long dist_of_orange_tree=sc.nextLong();
            long no_of_apple_fall=sc.nextLong();
            long no_of_orange_fall=sc.nextLong();
            long apple_fruit_fall_distance[]=new long[3];
            long orange_fruit_fall_distance[]=new long[2];
            for(int i=0;i<no_of_apple_fall;i++)
            {
                apple_fruit_fall_distance[i]=sc.nextLong();
            }
            for(int i=0;i<no_of_orange_fall;i++)
            {
                orange_fruit_fall_distance[i]=sc.nextLong();
            }
            for(int i=0;i<no_of_apple_fall;i++)
            {
            if((start_point<=(dist_of_apple_tree+apple_fruit_fall_distance[i])) &&                        ((dist_of_apple_tree+apple_fruit_fall_distance[i])<=end_point))
            {
                app_count++;
            }
               }
            System.out.println(""+app_count);
            for(int i=0;i<no_of_orange_fall;i++)
            {
                if((start_point<=(dist_of_orange_tree+orange_fruit_fall_distance[i])) &&                        ((dist_of_orange_tree+orange_fruit_fall_distance[i])<=end_point))
            {
                org_count++;
            }
               }
                System.out.println(""+org_count);
                
        }
    }*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int m, int n, int[] apples, int[] oranges) {
                    int cntA = 0;
                int cntO = 0;
                    int i,j,k,resA,resO;
        for(i=0 ; i < m ; i++){
            resA = a+apples[i];
                if(resA >= s && resA <= t){
                    cntA++;
                }
        }
        
        System.out.println(cntA);
        
        for(j=0 ; j < n ; j++){
                        resO = b+oranges[j];
                    if(resO >=s && resO <=t){
                        cntO++;
                    }
        }
        
        System.out.println(cntO);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, m, n, apples, oranges);

        scanner.close();
    }
}
            
                        

            