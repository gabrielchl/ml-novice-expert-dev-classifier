import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
    int N=in.nextInt();
    int K=in.nextInt();
    int Q=in.nextInt();
    int rot=K%N;
    int[] arr=new int[N];

    for(int i=0;i<N;i++)
        arr[i]=in.nextInt();

   for(int i=0;i<Q;i++)
       {
           int idx=in.nextInt();
           if(idx-rot>=0)
              System.out.println(arr[idx-rot]);
           else
            System.out.println(arr[idx-rot+arr.length]);
}
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}