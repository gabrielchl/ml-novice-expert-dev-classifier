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
        int diagnol1 = 0;
        int diagnol2 = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if (a_i == a_j)  diagnol1 = diagnol1 + a[a_i][a_j]; 
            }
        }
            int i =0;
            for (int j =n-1;j>=0;j--){           
                //a[i][j];
                diagnol2 = diagnol2 + a[i][j];
                i++; 
            }
        
            if (diagnol1>diagnol2) System.out.print((diagnol1-diagnol2));
            else System.out.print((diagnol2-diagnol1));
        
    }
}
