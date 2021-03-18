import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class sample {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();    // no of elements in array
        int[] a=new int[n];
        int r=scan.nextInt();   // no of rotations
        int q=scan.nextInt();
        for(int i=0;i<n;i++) {
        	a[i]=scan.nextInt();
        }
        int[] w=new int[n];
        for(int i=0;i<n;i++) {
        	w[i]=a[i];
        }
        for(int i=0;i<r;i++) {
        	for(int j=0;j<n-1;j++) {
        		w[j+1]=a[j];
        	}
        	w[0]=a[n-1];
        	for(int k=0;k<n;k++) {
        		a[k]=w[k];
        	}
        }
        for(int i=0;i<q;i++) {
        	int q1=scan.nextInt();
        	System.out.println(w[q1]);
        }
        
    }
}
