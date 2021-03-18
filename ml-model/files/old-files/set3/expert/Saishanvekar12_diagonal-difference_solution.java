import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
         int pSum=0,sSum=0,N,input;
        Scanner sc =new Scanner(System.in);
        N = sc.nextInt();
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                input=sc.nextInt();
                if(i==j)
                {
                    pSum+=input;
                }
                if(j==N-(i+1))
                {
                    sSum+=input;
                }
            }
        }
        System.out.println(Math.abs(pSum-sSum));
    }
        }