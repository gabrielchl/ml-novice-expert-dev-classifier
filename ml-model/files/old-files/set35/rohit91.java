import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        // Complete this function
        int[] result=new int[p.length];
        for(int i=1;i<=p.length;i++){
            for(int j=1;j<=p.length;j++){
                if(p[j-1]==i){
                    for(int k=1;k<=p.length;k++){
                        if(p[k-1]==j){
                            result[i-1]=k;
                            break;
                        }
                        
                    }
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int p_i = 0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int[] result = permutationEquation(p);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
