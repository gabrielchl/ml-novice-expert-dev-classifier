import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static public int absolute(int n, int[][]ar){
        
        int diagonalDer, diagonalIzq, valorAbsoluto;
        diagonalDer = diagonalIzq = valorAbsoluto = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    diagonalDer = diagonalDer + ar[i][j];
                }
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=n-1; j>=0; j--){
                if(j==(n-(i+1))){
                    diagonalIzq = diagonalIzq + ar[i][j];
                }
            }
        }
        
       return Math.abs(diagonalDer - diagonalIzq);    
        
        
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
                    
        }
        
        int result = absolute(n,a);   
         System.out.println(result);
        
    }
}
