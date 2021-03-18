import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        int[] t={1,2,3,4,5};
        int[] f=new int[5];
        int count=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<n;j++){
                if(t[i]==a[j]){
                    count++;
                }
            }
            f[i]=count;
            count=0;
        }
        int[] w=new int[5];
        for(int i=0;i<5;i++){
            w[i]=f[i];
        }
        int temp;
        for(int j=1;j<5;j++){
            if(w[0]<w[j]){
                temp=w[0];
                w[0]=w[j];
                w[j]=temp;
            }
        }
        int temp1=0;;
        for(int i=0;i<5;i++){
            if(w[0]==f[i]){
                temp1=i+1;
                break;
            }
        }
        System.out.println(temp1);
    }
}
