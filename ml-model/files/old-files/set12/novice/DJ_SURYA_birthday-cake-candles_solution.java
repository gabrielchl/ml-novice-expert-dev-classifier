import java.util.*;
import java.io.*;
import java.math.*;

public class sample{
    public static void main(String []args){
    	Scanner scan=new Scanner(System.in);
    	int n=scan.nextInt();
    	long[] a=new long[n];
    	for(int i=0;i<n;i++) {
    		a[i]=scan.nextLong();
    	}
    	long temp;
    	 
    	for(int j=1;j<n;j++) {
    		if(a[0]<a[j]) {
    			temp=a[0];
    			a[0]=a[j];
    			a[j]=temp;
    		}
    	}
    	long count=0;
    	for(int i=0;i<n;i++) {
    		if(a[i]==a[0]) {
    			count++;
    		}
    	}
    	System.out.println(count);
    }
}
