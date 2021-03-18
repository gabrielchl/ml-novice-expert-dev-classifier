import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        int count_apple=0,count_orange = 0;
        
        for(int x:apple){
            int y = x + a;
            if(y>=s && y<=t)
                count_apple++;
        }
        
        for(int x:orange){
            int y = x + b;
            if(y>=s&&y<=t)
                count_orange++;
        }
        
        System.out.println(count_apple+"\n"+count_orange);
    }
}
