import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        
        int totalCandles = 0;
        int tallestCandle = -1;
        
        for(int i=0; i<n; i++) {
            if(height[i] > tallestCandle) {
                tallestCandle = height[i];
            }  
        }
        
        for(int i=0; i<n; i++) {
            if(tallestCandle == height[i]) {
                totalCandles++;
            }
        }
        
        System.out.println(totalCandles);
    }
}
