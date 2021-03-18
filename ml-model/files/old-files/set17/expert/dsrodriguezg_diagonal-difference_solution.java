import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static public int solve(int n, int[][]ar){

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

}
