import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int t = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int m = input.nextInt();
        int n = input.nextInt();
        int apples = 0;
        int oranges = 0;
        for(int i=0;i<m;i++){
            int landSpot = input.nextInt() + a;  
            if(landSpot >= s && landSpot <= t){
                apples++;
            }
        }
        for(int i=0;i<n;i++){
            int landSpot = input.nextInt() + b;  
            if(landSpot >= s && landSpot <= t){
                oranges++;
            }
        }
        System.out.println(apples);
        System.out.println(oranges);
    }
}
