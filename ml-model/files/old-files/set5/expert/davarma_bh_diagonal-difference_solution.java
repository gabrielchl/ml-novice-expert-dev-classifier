import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int a[][]= new int[100][100];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=input.nextInt();
                }
            }
            int diag1=0;
            int diag2=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j){
                        diag1=diag1+a[i][j];
                    }
                    if(i== n-j-1){
                        diag2=diag2+a[i][j];
                    }
                }
            }
            if(diag1>=diag2){
                System.out.println(diag1 - diag2);    
            }
            else if(diag1<diag2){
                System.out.println(diag2 - diag1);
            }
        
    }
}
