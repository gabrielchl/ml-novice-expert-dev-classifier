
import java.util.*;
import java.io.*;
import java.math.*;

public class sample{
    public static void main(String []args){
    	Scanner scan=new Scanner(System.in);
    	long s=scan.nextLong();
    	long t=scan.nextLong();
    	long a=scan.nextLong();
    	long b=scan.nextLong();
    	int m=scan.nextInt();
    	int n=scan.nextInt();
    	long[] marray=new long[m];
    	for(int i=0;i<m;i++) {
    		marray[i]=scan.nextLong();
    	}
    	long[] narray=new long[n];
    	for(int i=0;i<n;i++) {
    		narray[i]=scan.nextLong();
    	}
    	int count=0;
    	for(int i=0;i<m;i++) {
    		if(marray[i]>0) {
    			long temp;
    			temp=marray[i]+a;
    			if(temp>=s && temp<=t) {
    				count++;
    			}
    		}
    	}
    	int count1=0;
    	for(int i=0;i<n;i++) {
    		if(narray[i]<0) {
    			long temp1;
    			temp1=b+narray[i];
    			if(temp1>=s && temp1<=t) {
    				count1++;
    			}
    		}
    	}
    	System.out.println(count+"\n"+count1);
    }
}
