import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] ar=new int[5];
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
        Arrays.sort(ar);
        long min=0,max=0;
        for(int i=0;i<5;i++){
            if(i<4)
                min+=ar[i];
            if(i>0)
                max+=ar[i];
        }
        System.out.println(min+" "+max);
        
    }
}
