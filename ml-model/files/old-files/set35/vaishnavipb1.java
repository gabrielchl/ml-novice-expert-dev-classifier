import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] permutationEquation(int[] p) {
        int ln=p.length;
       int[]res=new int[ln];
        for(int i=0;i<ln;i++){
            int index=p[p[p[i]]];
           // System.out.println("when i is "+i+" index i.e. x is "+index);
            res[index]=p[i];
            //System.out.println("x= "+index+" and y = "+p[i]);
        }
    return res;}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n++;
        int[] p = new int[n];
        p[0]=0;
        for(int p_i = 1; p_i < n; p_i++){
            p[p_i] = in.nextInt();
        }
        int[] result = permutationEquation(p);
        for (int i = 1; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
