import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n=scan.nextInt();int k=scan.nextInt();int q=scan.nextInt();
        int array[]=new int[n];
        int a=k%n;
        for(int i=0;i<n;i++){
            array[i]=scan.nextInt();
        }
        
          
        /*for(int i=0;i<k;i++){
        a=array[n-1];
            for(int j=0;j<n-1;j++){
                array[n-1-j]=array[n-2-j];
            }
            array[0]=a;
        }*/
        
        for(int i=0;i<q;i++){
            int idx=scan.nextInt();
            if(idx-a>=0)
            System.out.println(array[idx-a]);
            else
            System.out.println(array[idx-a+n]);
        }
    }
}