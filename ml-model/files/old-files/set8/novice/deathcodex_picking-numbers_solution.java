import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            ar[a_i] = in.nextInt();
        }
        Arrays.sort(ar);
        int counter=0,cCounter=1,p=1;
        for(int i=0;i<n-1;i++){
            p=i+1;
            while(p<n&&ar[p]-ar[i]<=1){
                cCounter+=1;p++;
            }
            if(cCounter>counter)counter=cCounter;
            cCounter=1;
        }
            System.out.println(counter);
    }
}
