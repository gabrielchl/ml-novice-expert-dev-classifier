import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        int primary = 0;
        int secondary = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(i==j) {
                    primary += a[i][j];
                }
                
                if(i+j == n-1) {
                    secondary += a[i][j];
                }
            }
        }
        
        int difference = primary - secondary;
        System.out.println(difference<0 ? -difference : difference);
    }
}
